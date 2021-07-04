package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Noticia  {

    private UUID id;
    private String titulo;
    private String conteudo;
    private UUID categoria;
    private UUID author;
    private Date data;
    private boolean criada;
    private UUID atribuidoA;
    private UUID atribuidoPor;
    private boolean editada;
    private UUID editadoPor;
    private boolean revisada;
    private UUID revisadoPor;
    private boolean aprovada;
    private String motivoReprovada;
    private UUID aprovadoPor;
    private boolean digital;
    private int valor;
    private ArrayList<UUID> comentarios;
    private ArrayList<UUID> anuncios;
    private boolean impresso;
    private ArrayList<UUID> erros;
    private boolean privado;

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Noticia(){
        super();
        this.id = UUID.randomUUID();
        this.data = new Date();
    }

    public boolean isCriada() {
        return criada;
    }

    public void setCriada(boolean criada) {
        this.criada = criada;
    }

    public UUID getAtribuidoPor() {
        return atribuidoPor;
    }

    public void setAtribuidoPor(UUID atribuidoPor) {
        this.atribuidoPor = atribuidoPor;
    }


    public String getMotivoReprovada() {
        return motivoReprovada;
    }

    public void setMotivoReprovada(String motivoReprovada) {
        this.motivoReprovada = motivoReprovada;
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

    public UUID getAuthor() {
        return author;
    }

    public void setAuthor(UUID author) {
        this.author = author;
    }

    public Date getData() {
        return data;
    }

    public ArrayList<UUID> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<UUID> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<UUID> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(ArrayList<UUID> anuncios) {
        this.anuncios = anuncios;
    }

    public boolean isImpresso() {
        return impresso;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
    }

    public ArrayList<UUID> getErros() {
        return erros;
    }

    public void setErros(ArrayList<UUID> erros) {
        this.erros = erros;
    }

    public Noticia get( UUID id){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList<Noticia> getByChefe( UUID id){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.getAtribuidoPor().equals(id))
                    .collect(Collectors.toList());
            return new ArrayList<>(list);
        }catch (Exception e){
            return null;
        }
    }
    public ArrayList<Noticia> getByCategory( UUID id){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.getCategoria().equals(id))
                    .collect(Collectors.toList());
            return new ArrayList<>(list);
        }catch (Exception e){
            return null;
        }
    }

    /**
     *
     * @param id Jornalista
     * @return
     */
    public ArrayList<Noticia> getToCreate(UUID id){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.getAtribuidoA().equals(id) && !noticia.isCriada() && noticia.motivoReprovada == null)
                    .collect(Collectors.toList());
            return new ArrayList<>(list);
        }catch (Exception e){
            return null;
        }
    }
    public ArrayList<Noticia> getReproved(UUID id){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.getAtribuidoA().equals(id) && !noticia.isAprovada() && !noticia.isCriada())
                    .collect(Collectors.toList());
            return new ArrayList<>(list);
        }catch (Exception e){
            return null;
        }
    }
    public ArrayList<Noticia> getAproved(){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.isAprovada())
                    .collect(Collectors.toList());
            return new ArrayList<>(list);
        }catch (Exception e){
            return null;
        }
    }
    public ArrayList<Noticia> getCreated(){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.isCriada() && !noticia.isEditada())
                    .collect(Collectors.toList());
            return new ArrayList<>(list);
        }catch (Exception e){
            return null;
        }
    }
    public ArrayList getAll(){
        return DB.noticia;
    }

    public boolean create(){
        try{
            DB.noticia.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){
        try{
            DB.noticia.set(DB.noticia.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.noticia.remove(DB.noticia.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public ArrayList<Noticia> getEdited(){
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.isEditada())
                    .collect(Collectors.toList());
            return new ArrayList<Noticia>(list);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList<Noticia> getRevised() {
        try {
            List<Noticia> list = DB.noticia
                    .stream()
                    .filter(noticia -> noticia.isRevisada() && !noticia.isAprovada())
                    .collect(Collectors.toList());
            return new ArrayList<Noticia>(list);
        } catch (Exception e) {
            return null;
        }
    }
}
