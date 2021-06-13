package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Categoria{

    private UUID id;
    private String nome;

    public Categoria(){
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

    public Categoria get( UUID id){
        try {
            List<Categoria> list  = DB.categoria
                    .stream()
                    .filter(categoria-> categoria.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.categoria;
    }

    public boolean create(){
        try{
            DB.categoria.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.categoria.set(DB.categoria.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.categoria.remove(DB.categoria.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
