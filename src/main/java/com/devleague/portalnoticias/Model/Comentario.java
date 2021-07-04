package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Comentario {

    private UUID id;
    private UUID usuario;
    private boolean aprovada;
    private UUID reprovadaPor;

    public Comentario(){
        super();

        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public UUID getUsuario() {
        return usuario;
    }

    public void setUsuario(UUID usuario) {
        this.usuario = usuario;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public UUID getReprovadaPor() {
        return reprovadaPor;
    }

    public void setReprovadaPor(UUID reprovadaPor) {
        this.reprovadaPor = reprovadaPor;
    }

    public Comentario get(UUID id){
        try {
            List<Comentario> list  = DB.comentario
                    .stream()
                    .filter(comentario-> comentario.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.comentario;
    }

    public boolean create(){
        try{
            DB.comentario.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.comentario.set(DB.comentario.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.comentario.remove(DB.comentario.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
