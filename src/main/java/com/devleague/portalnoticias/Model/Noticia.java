package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.*;
import java.util.stream.Collectors;

public class Noticia  {

    private UUID id;
    private String titulo;
    private String conteudo;
    private UUID categoria;
    private String author;
    private Date data;


    public Noticia(){
        super();
        this.id = UUID.randomUUID();
        this.data = new Date();
    }

    public UUID getId() {
        return id;
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

    public UUID getCategoria() {
        return categoria;
    }

    public void setCategoria(UUID categoria) {
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


    public Noticia get(DB db, UUID id){
        try {
            List<Noticia> list  = db.noticia
                .stream()
                .filter(noticia-> noticia.getId().equals(id))
                .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(DB db){
        return db.noticia;
    }

    public boolean create(DB db){
        try{
            db.noticia.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(DB db){

        try{
            db.noticia.set(db.noticia.indexOf(this.get(db,this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(DB db){
        try{
            db.noticia.remove(db.noticia.indexOf(this.get(db,this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
