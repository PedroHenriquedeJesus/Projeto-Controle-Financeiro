package com.pk.api_controle_financeiro.service;

import com.pk.api_controle_financeiro.model.Meta;
import com.pk.api_controle_financeiro.repository.IMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetaService {

    @Autowired
    private IMetaRepository metaRepository;

    public Meta salvar(Meta meta) {
        return metaRepository.save(meta);
    }

    public Optional<Meta> buscarPorId(Long id) {
        return metaRepository.findById(id);
    }

    public List<Meta> buscarTodas() {
        return metaRepository.findAll();
    }

    public void excluir(Long id) {
        metaRepository.deleteById(id);
    }
}
