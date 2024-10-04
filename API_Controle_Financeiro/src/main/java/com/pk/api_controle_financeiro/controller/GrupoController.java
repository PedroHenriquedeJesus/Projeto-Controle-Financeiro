package com.pk.api_controle_financeiro.controller;

import com.pk.api_controle_financeiro.model.Grupo;
import com.pk.api_controle_financeiro.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/grupos")
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @PostMapping
    public ResponseEntity<Grupo> criarGrupo(@RequestBody Grupo grupo) {
        Grupo novoGrupo = grupoService.salvar(grupo);
        return ResponseEntity.ok(novoGrupo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grupo> buscarGrupoPorId(@PathVariable Long id) {
        Optional<Grupo> grupo = grupoService.buscarPorId(id);
        return grupo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Grupo>> listarGrupos() {
        List<Grupo> grupos = grupoService.buscarTodos();
        return ResponseEntity.ok(grupos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirGrupo(@PathVariable Long id) {
        grupoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
