package com.devleague.portalnoticias.Model;

import java.util.Date;

public class Noticia {
    private String titulo;
    private String conteudo;
    private String categoria;
    private String author;
    private Date data;


    public Noticia(String titulo, String conteudo, String categoria, String author){
        this.author = author;
        this.conteudo = conteudo;
        this.categoria = categoria;
        this.author = author;
        this.data = new Date();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


}
