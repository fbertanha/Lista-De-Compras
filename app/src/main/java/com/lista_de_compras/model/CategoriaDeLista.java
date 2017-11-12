package com.lista_de_compras.model;

import java.io.Serializable;

/**
 * Created by evely on 30/08/2017.
 */

public class CategoriaDeLista implements Serializable {
    private int codigo;
    private String nome;

    public CategoriaDeLista() {
    }

    public CategoriaDeLista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CategoriaDeLista{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
