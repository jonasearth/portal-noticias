package com.devleague.portalnoticias.Model;

import com.devleague.portalnoticias.DB.DB;

import java.util.ArrayList;

public class Categoria {
    private String nome;

    public Categoria(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static Categoria get(DB db, int index){
        return db.categorias.get(index);
    }
    public static ArrayList<Categoria> getAll(DB db){
        return db.categorias;
    }
    public static boolean create(DB db, Categoria categoria){
        return  db.categorias.add(categoria);
    }
    public static Categoria update(DB db, int index, Categoria categoria){
        return  db.categorias.set(index, categoria);
    }
    public static Categoria delete(DB db, int index){
        return db.categorias.remove(index);
    }
}
