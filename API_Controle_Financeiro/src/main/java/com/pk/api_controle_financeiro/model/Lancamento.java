package com.pk.api_controle_financeiro.model;

import jakarta.persistence.*;

import java.util.Set;

public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String data;
    private String tipo;
    private double valor;
    private String categoria;

    @OneToMany
    @JoinColumn
    private Set<Grupo> grupo;


    public Lancamento(Long id, String nome, String descricao, String data, String tipo, double valor, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
        this.categoria = categoria;
    }

    public Lancamento() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Lancamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data='" + data + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
