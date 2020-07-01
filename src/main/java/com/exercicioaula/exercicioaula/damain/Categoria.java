package com.exercicioaula.exercicioaula.damain;

import java.util.Objects;

public class Categoria {

    //Atributos Básicos
    private Integer id;
    private String nome;

    //Associações


    //Construtores
    public Categoria () {

    }

    public Categoria(Integer id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }


    //Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //hashCode e equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(getId(), categoria.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
