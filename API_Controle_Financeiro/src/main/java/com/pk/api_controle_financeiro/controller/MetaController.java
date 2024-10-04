package com.pk.api_controle_financeiro.controller;

import com.pk.api_controle_financeiro.model.Meta;
import com.pk.api_controle_financeiro.service.MetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/metas")
public class MetaController {

    @Autowired
    private MetaService metaService;

    @PostMapping
    public ResponseEntity<Meta> criarMeta(@RequestBody Meta meta) {
        Meta novaMeta = metaService.salvar(meta);
        return ResponseEntity.ok(novaMeta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meta> buscarMetaPorId(@PathVariable Long id) {
        Optional<Meta> meta = metaService.buscarPorId(id);
        return meta.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Meta>> listarMetas() {
        List<Meta> metas = metaService.buscarTodas();
        return ResponseEntity.ok(metas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirMeta(@PathVariable Long id) {
        metaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
