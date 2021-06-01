package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class UpdateCategoriaController {
    public static boolean update(DB db, int index, Categoria categoria) {
        try {
            return categoria.update(db, index ,categoria);
        }catch (Exception e){
            return false;
        }
    }
}
