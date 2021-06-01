package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class CreateCategoriaController {
    public static boolean add(DB db, String nome) {
        Categoria categoria = new Categoria();
        categoria.setNome(nome);
        try {
            categoria.create(db, categoria);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
