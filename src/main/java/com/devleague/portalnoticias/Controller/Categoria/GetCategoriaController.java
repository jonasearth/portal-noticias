package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;
import java.util.UUID;

public class GetCategoriaController {
    public static Categoria get( UUID id) {
        Categoria categoria = new Categoria();
        try {
            return categoria.get(id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Categoria> getAll() {
        Categoria categoria = new Categoria();
        try {
            return categoria.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
