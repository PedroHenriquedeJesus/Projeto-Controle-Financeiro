package com.pk.api_controle_financeiro.service;

import com.pk.api_controle_financeiro.model.Lancamento;
import com.pk.api_controle_financeiro.repository.ILancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private ILancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        return lancamentoRepository.save(lancamento);
    }

    public Optional<Lancamento> buscarPorId(Long id) {
        return lancamentoRepository.findById(id);
    }

    public List<Lancamento> buscarTodos() {
        return lancamentoRepository.findAll();
    }

    public void excluir(Long id) {
        lancamentoRepository.deleteById(id);
    }
}
