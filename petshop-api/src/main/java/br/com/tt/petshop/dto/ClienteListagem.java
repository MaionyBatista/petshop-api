package br.com.tt.petshop.dto;

public class ClienteListagem {

    private final Long id;
    private final String nome;
    private final String cpf;

    public ClienteListagem(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}