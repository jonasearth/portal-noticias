package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class UpdateCategoriaController {

    public static boolean update(DB db, Categoria categoria) {
        try {
            categoria.update(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
