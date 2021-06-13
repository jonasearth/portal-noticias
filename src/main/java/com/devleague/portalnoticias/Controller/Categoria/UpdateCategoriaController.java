package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class UpdateCategoriaController {

    public static boolean update(Categoria categoria) {
        try {
            categoria.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
