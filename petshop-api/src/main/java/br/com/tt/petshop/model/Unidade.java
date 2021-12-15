package br.com.tt.petshop.model;

public class Unidade {
    private Integer id;
    private String nome;
    private String endereco;

    public Unidade(Integer id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
