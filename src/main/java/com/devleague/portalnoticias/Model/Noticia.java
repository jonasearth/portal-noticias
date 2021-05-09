package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.Date;

public class Noticia {


    private String titulo;
    private String conteudo;
    private String categoria;
    private String author;
    private Date data;


    public Noticia(String titulo, String conteudo, String categoria, String author){
        this.titulo = titulo;
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


    /**
     * DB Actions
     */

    public static Noticia get(DB db, int index){
        return db.noticias.get(index);
    }
    public static ArrayList<Noticia> getAll(DB db){
        return db.noticias;
    }
    public static ArrayList<Noticia> getByCategory(DB db, String categoria){
        ArrayList<Noticia> noticias = new ArrayList<>();

         for (int i = 0; i < db.noticias.size() ; i++){
             if (db.noticias.get(i).getCategoria().equals(categoria))
                 noticias.add(db.noticias.get(i));
         }
         return  noticias;
    }
    public static boolean create(DB db, Noticia noticia){
        return  db.noticias.add(noticia);
    }
    public static Noticia update(DB db, int index, Noticia noticia){
        return  db.noticias.set(index, noticia);
    }
    public static Noticia delete(DB db, int index){
        return db.noticias.remove(index);
    }


}
