package com.devleague.portalnoticias.Controller.Categoria;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;

public class CreateCategoriaController {
    public static boolean add(Categoria categoria) {
        try {
            categoria.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
