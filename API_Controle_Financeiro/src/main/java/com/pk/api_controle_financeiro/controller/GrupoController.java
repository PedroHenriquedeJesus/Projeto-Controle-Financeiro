package com.pk.api_controle_financeiro.controller;

import com.pk.api_controle_financeiro.model.Grupo;
import com.pk.api_controle_financeiro.repository.IGrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/grupos")
public class GrupoController {

    @Autowired
    private IGrupoRepository grupoRepository;

    @PostMapping
    public ResponseEntity<Grupo> createGrupo(@RequestBody Grupo grupo) {
        Grupo savedGrupo = grupoRepository.save(grupo);
        return new ResponseEntity<>(savedGrupo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Set<Grupo>> getAllGrupos() {
        Set<Grupo> grupos = new HashSet<>(grupoRepository.findAll());
        return new ResponseEntity<>(grupos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grupo> getGrupoById(@PathVariable Long id) {
        Optional<Grupo> grupo = grupoRepository.findById(id);
        return grupo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grupo> updateGrupo(@PathVariable Long id, @RequestBody Grupo grupo) {
        if (!grupoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        grupo.setId(id);
        Grupo updatedGrupo = grupoRepository.save(grupo);
        return new ResponseEntity<>(updatedGrupo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrupo(@PathVariable Long id) {
        if (!grupoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        grupoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}