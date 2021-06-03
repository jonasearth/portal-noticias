package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

public class UpdateNoticiaController {

    public static boolean update(DB db, int index, Noticia noticia) {
        try {
            noticia.update(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
