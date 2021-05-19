package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class UpdateCategoriaController {
    public static Categoria update(DB db, int index, Categoria categoria) {
        try {
            return Categoria.update(db, index ,categoria);
        }catch (Exception e){
            return null;
        }
    }
}
