package com.pk.api_controle_financeiro.service;

import com.pk.api_controle_financeiro.model.Grupo;
import com.pk.api_controle_financeiro.repository.IGrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    @Autowired
    private IGrupoRepository grupoRepository;

    public Grupo salvar(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public Optional<Grupo> buscarPorId(Long id) {
        return grupoRepository.findById(id);
    }

    public List<Grupo> buscarTodos() {
        return grupoRepository.findAll();
    }

    public void excluir(Long id) {
        grupoRepository.deleteById(id);
    }
}
