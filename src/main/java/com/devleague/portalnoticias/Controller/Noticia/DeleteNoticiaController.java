package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

public class DeleteNoticiaController {

    public static boolean delete(DB db, int index) {
        try {
            Noticia.delete(db, index);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
