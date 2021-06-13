package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;


public class CreateNoticiaController {

    public static boolean add( Noticia noticia) {
        try {
            noticia.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
