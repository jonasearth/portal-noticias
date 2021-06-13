package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Editor {

    private UUID id;
    private String nome;
    private float salario;

    public Editor(){
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

    public Editor get( UUID id){
        try {
            List<Editor> list  = DB.editor
                    .stream()
                    .filter(editor-> editor.getId().equals(id))
                    .collect(Collectors.toList());
            return list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    public ArrayList getAll(){
        return DB.editor;
    }

    public boolean create(){
        try{
            DB.editor.add(this);
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public boolean update(){

        try{
            DB.editor.set(DB.editor.indexOf(this.get(this.id)), this);
            return  true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean delete(){
        try{
            DB.editor.remove(DB.editor.indexOf(this.get(this.id)));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
