package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ErrosNoticia {

    private UUID id;
    private String erro;
    private UUID revisor;

    public ErrosNoticia(){
        super();

        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public UUID getRevisor() {
        return revisor;
    }

    public void setRevisor(UUID revisor) {
        this.revisor = revisor;
    }

    public ErrosNoticia get(UUID id){
        try {
            List<ErrosNoticia> list  = DB.errosNoticia
                    .stream()
                    .filter(errosNoticia-> errosNoticia.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.errosNoticia;
    }

    public boolean create(){
        try{
            DB.errosNoticia.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.errosNoticia.set(DB.errosNoticia.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.errosNoticia.remove(DB.errosNoticia.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
