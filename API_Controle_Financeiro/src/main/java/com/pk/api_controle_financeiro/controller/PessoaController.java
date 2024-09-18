package com.pk.api_controle_financeiro.controller;

import com.pk.api_controle_financeiro.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    // Criar uma nova Pessoa
    @PostMapping
    public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa) {
        Pessoa savedPessoa = pessoaService.save(pessoa);
        return ResponseEntity.ok(savedPessoa);
    }

    // Obter uma Pessoa pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaService.findById(id);
        return pessoa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Obter todas as Pessoas
    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        List<Pessoa> pessoas = pessoaService.findAll();
        return ResponseEntity.ok(pessoas);
    }

    // Atualizar uma Pessoa existente
    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoaDetails) {
        Optional<Pessoa> optionalPessoa = pessoaService.findById(id);
        if (optionalPessoa.isPresent()) {
            Pessoa existingPessoa = optionalPessoa.get();
            existingPessoa.setNome(pessoaDetails.getNome());
            existingPessoa.setCPF(pessoaDetails.getCPF());
            existingPessoa.setEmail(pessoaDetails.getEmail());
            existingPessoa.setTelefone(pessoaDetails.getTelefone());
            Pessoa updatedPessoa = pessoaService.save(existingPessoa);
            return ResponseEntity.ok(updatedPessoa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Excluir uma Pessoa pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(@PathVariable Long id) {
        if (pessoaService.findById(id).isPresent()) {
            pessoaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
