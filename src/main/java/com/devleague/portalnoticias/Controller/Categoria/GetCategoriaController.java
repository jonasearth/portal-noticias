package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

import java.util.ArrayList;

public class GetCategoriaController {
    public static Categoria get(DB db, int index) {
        Categoria categoria = new Categoria();
        try {
            return (Categoria) categoria.get(db, index);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Categoria> getAll(DB db) {
        Categoria categoria = new Categoria();
        try {
            return categoria.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
}
