package br.com.tt.petshop.dto;

import java.time.LocalDate;

public class ClienteAtualizacao {

    private final String nome;
    private final String cpf;
    private final String telefone;
    private final LocalDate nascimento;

    public ClienteAtualizacao(String nome, String cpf, String telefone, LocalDate nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}