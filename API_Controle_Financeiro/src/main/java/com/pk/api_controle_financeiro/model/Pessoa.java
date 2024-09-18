package com.pk.api_controle_financeiro.model;

import jakarta.persistence.*;

@Entity
//@Table(name = "SENAI_FORMULARIO")

public class Pessoa {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String CPF;
    private String email;
    private String telefone;

    public Pessoa(Long id, String nome, String CPF, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa(){

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
