package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class CreateCategoriaController {
    public static boolean add(DB db, Categoria categoria) {
        try {
            categoria.create(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
