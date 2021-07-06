package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Anuncio {

    private UUID id;
    private String meio;
    private String fimVisualizacao;
    private String conteudo;
    private UUID anunciante;
    private int clicks;
    private int views;
    private int exemplaresEntregues;

    public Anuncio(){
        super();
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getMeio() {
        return meio;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

    public String getFimVisualizacao() {
        return fimVisualizacao;
    }

    public void setFimVisualizacao(String fimVisualizacao) {
        this.fimVisualizacao = fimVisualizacao;
    }

    public UUID getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(UUID anunciante) {
        this.anunciante = anunciante;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getExemplaresEntregues() {
        return exemplaresEntregues;
    }

    public void setExemplaresEntregues(int exemplaresEntregues) {
        this.exemplaresEntregues = exemplaresEntregues;
    }

    public Anuncio get( UUID id){
        try {
            List<Anuncio> list  = DB.anuncio
                    .stream()
                    .filter(anuncio-> anuncio.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.anuncio;
    }

    public boolean create(){
        try{
            DB.anuncio.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.anuncio.set(DB.anuncio.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.anuncio.remove(DB.anuncio.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
