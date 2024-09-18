package com.pk.api_controle_financeiro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TABELA_META")
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private double valor;


    public Meta() {
    }

    public Meta(Long id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Meta{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
