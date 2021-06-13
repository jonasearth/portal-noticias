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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }




    public Chefe get( UUID id){
        try {
            List<Chefe> list  = DB.chefe
                    .stream()
                    .filter(chefe-> chefe.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.chefe;
    }

    public boolean create(){
        try{
            DB.chefe.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.chefe.set(DB.chefe.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.chefe.remove(DB.chefe.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
