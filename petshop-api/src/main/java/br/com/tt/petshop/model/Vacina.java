package br.com.tt.petshop.model;

public class Vacina {
    private Long id;
    private String nome;
    private Float valor;

    public Vacina(Long id, String nome, Float valor){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Long getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getValor() {
        return valor;
    }
}