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
    private boolean criada;
    private UUID atribuidoA;
    private boolean editada;
    private UUID editadoPor;
    private boolean revisada;
    private UUID revisadoPor;
    private boolean aprovada;
    private UUID aprovadoPor;
    private boolean digital;
    private int valor;

    public Noticia(){
        super();
        this.id = UUID.randomUUID();
        this.data = new Date();
    }

    public UUID getAtribuidoA() {
        return atribuidoA;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public UUID getAprovadoPor() {
        return aprovadoPor;
    }

    public void setAprovadoPor(UUID aprovadoPor) {
        this.aprovadoPor = aprovadoPor;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public UUID getRevisadoPor() {
        return revisadoPor;
    }

    public void setRevisadoPor(UUID revisadoPor) {
        this.revisadoPor = revisadoPor;
    }

    public boolean isRevisada() {
        return revisada;
    }

    public void setRevisada(boolean revisada) {
        this.revisada = revisada;
    }

    public void setAtribuidoA(UUID atribuidoA) {
        this.atribuidoA = atribuidoA;
    }

    public boolean isEditada() {
        return editada;
    }

    public UUID getEditadoPor() {
        return editadoPor;
    }

    public void setEditadoPor(UUID editadoPor) {
        this.editadoPor = editadoPor;
    }

    public void setEditada(boolean editada) {
        this.editada = editada;
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
            List<Noticia> list = db.noticia
                .stream()
                .filter(noticia -> noticia.getId().equals(id))
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
