package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

public class CreateNoticiaController {

    public static boolean add(DB db, String titulo, String conteudo, String categoria, String author) {
        Noticia noticia = new Noticia(titulo, conteudo, categoria, author);
        try {
            Noticia.create(db, noticia);
            return true;
        }catch (Exception e){
            return false ;
            return false ;
        }
    }
}
