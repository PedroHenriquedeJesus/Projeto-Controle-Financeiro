package com.pk.api_controle_financeiro.controller;

import com.pk.api_controle_financeiro.model.Lancamento;
import com.pk.api_controle_financeiro.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentoService lancamentoService;

    // Criar ou atualizar um Lancamento
    @PostMapping
    public ResponseEntity<Lancamento> createOrUpdateLancamento(@RequestBody Lancamento lancamento) {
        Lancamento savedLancamento = lancamentoService.save(lancamento);
        return ResponseEntity.ok(savedLancamento);
    }

    // Obter um Lancamento pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> getLancamentoById(@PathVariable Long id) {
        Optional<Lancamento> lancamento = lancamentoService.findById(id);
        return lancamento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Obter todos os Lancamentos
    @GetMapping
    public ResponseEntity<List<Lancamento>> getAllLancamentos() {
        List<Lancamento> lancamentos = lancamentoService.findAll();
        return ResponseEntity.ok(lancamentos);
    }

    // Atualizar um Lancamento existente
    @PutMapping("/{id}")
    public ResponseEntity<Lancamento> updateLancamento(@PathVariable Long id, @RequestBody Lancamento lancamentoDetails) {
        Optional<Lancamento> optionalLancamento = lancamentoService.findById(id);
        if (optionalLancamento.isPresent()) {
            Lancamento existingLancamento = optionalLancamento.get();
            existingLancamento.setNome(lancamentoDetails.getNome());
            existingLancamento.setId(lancamentoDetails.getId());
            existingLancamento.setId(lancamentoDetails.getId());
            existingLancamento.setNome(lancamentoDetails.getTipo());
            Lancamento updatedLancamento = lancamentoService.save(existingLancamento);
            return ResponseEntity.ok(updatedLancamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Excluir um Lancamento pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLancamento(@PathVariable Long id) {
        if (lancamentoService.findById(id).isPresent()) {
            lancamentoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

