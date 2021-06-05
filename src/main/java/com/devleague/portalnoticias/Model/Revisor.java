package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Revisor {

    private UUID id;
    private String nome;
    private float salario;

    public Revisor(){
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

    public Revisor get(DB db, UUID id){
        try {
            List<Revisor> list  = db.revisor
                    .stream()
                    .filter(revisor-> revisor.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(DB db){
        return db.revisor;
    }

    public boolean create(DB db){
        try{
            db.revisor.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(DB db){

        try{
            db.revisor.set(db.revisor.indexOf(this.get(db,this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(DB db){
        try{
            db.revisor.remove(db.revisor.indexOf(this.get(db,this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
