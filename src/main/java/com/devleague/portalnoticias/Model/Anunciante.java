package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Anunciante {

    private UUID id;
    private String nome;
    private boolean publico;
    private String esfera ;
    private String numeroCartao;
    private String validade;
    private String codSeguranca;

    public Anunciante(){
        super();
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public String getEsfera() {
        return esfera;
    }

    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public Anunciante get( UUID id){
        try {
            List<Anunciante> list  = DB.anunciante
                    .stream()
                    .filter(anunciante-> anunciante.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.anunciante;
    }

    public boolean create(){
        try{
            DB.anunciante.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.anunciante.set(DB.anunciante.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.anunciante.remove(DB.anunciante.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
