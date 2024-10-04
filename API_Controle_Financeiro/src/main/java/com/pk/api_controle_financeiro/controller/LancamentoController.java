package com.pk.api_controle_financeiro.controller;

import com.pk.api_controle_financeiro.model.Lancamento;
import com.pk.api_controle_financeiro.service.LancamentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/lancamentos")
public class LancamentoController {

        @Autowired
        private LancamentoService lancamentoService;

        @PostMapping
        public ResponseEntity<Lancamento> criarLancamento(@RequestBody Lancamento lancamento) {
            Lancamento novoLancamento = lancamentoService.salvar(lancamento);
            return ResponseEntity.ok(novoLancamento);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Lancamento> buscarLancamentoPorId(@PathVariable Long id) {
            Optional<Lancamento> lancamento = lancamentoService.buscarPorId(id);
            return lancamento.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        }

        @GetMapping
        public ResponseEntity<List<Lancamento>> listarLancamentos() {
            List<Lancamento> lancamentos = lancamentoService.buscarTodos();
            return ResponseEntity.ok(lancamentos);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> excluirLancamento(@PathVariable Long id) {
            lancamentoService.excluir(id);
            return ResponseEntity.noContent().build();
        }

    }
