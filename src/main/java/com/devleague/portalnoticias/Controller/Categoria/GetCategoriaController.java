package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;
import java.util.UUID;

public class GetCategoriaController {
    public static Categoria get(DB db, UUID id) {
        Categoria categoria = new Categoria();
        try {
            return categoria.get(db, id);
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
