package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Chefe {

    private UUID id;
    private String nome;
    private float salario;

    public Chefe(){
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

    public Chefe get(DB db, UUID id){
        try {
            List<Chefe> list  = db.chefe
                    .stream()
                    .filter(chefe-> chefe.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(DB db){
        return db.chefe;
    }

    public boolean create(DB db){
        try{
            db.chefe.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(DB db){

        try{
            db.chefe.set(db.chefe.indexOf(this.get(db,this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(DB db){
        try{
            db.chefe.remove(db.chefe.indexOf(this.get(db,this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
