package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Jornalista {

    private UUID id;
    private String nome;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    private float salario;

    public Jornalista() {
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

    public Jornalista get(UUID id){
        try {
            List<Jornalista> list  = DB.jornalista
                    .stream()
                    .filter(jornalista-> jornalista.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.jornalista;
    }

    public boolean create(){
        try{
            DB.jornalista.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.jornalista.set(DB.jornalista.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.jornalista.remove(DB.jornalista.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
