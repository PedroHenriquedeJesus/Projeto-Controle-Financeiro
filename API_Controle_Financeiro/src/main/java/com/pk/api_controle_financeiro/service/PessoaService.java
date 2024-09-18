package com.pk.api_controle_financeiro.service;

import com.pk.api_controle_financeiro.model.Pessoa;
import com.pk.api_controle_financeiro.repository.IPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private IPessoaRepository pessoaRepository;

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public void deleteById(Long id) {
        pessoaRepository.deleteById(id);
    }
}
