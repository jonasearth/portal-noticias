package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.Date;
import java.util.UUID;

public class CreateNoticiaController {

    public static boolean add(DB db, Noticia noticia) {
        try {
            noticia.create(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
