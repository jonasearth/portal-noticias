package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class DeleteCategoriaController {
    public static boolean delete(DB db, Categoria categoria) {
        try {
            categoria.delete(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
