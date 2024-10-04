package com.pk.api_controle_financeiro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "meta")
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false)
    private Double valor;

    public Meta(Long id, String tipo, Double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Meta() {
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
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