package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

public class UpdateNoticiaController {

    public static Noticia update(DB db, int index, String titulo, String conteudo, String categoria, String author) {
        Noticia noticia = new Noticia(titulo, conteudo, categoria, author);
        try {
            return Noticia.update(db, index ,noticia);
        }catch (Exception e){
            return null;
        }
    }
}
