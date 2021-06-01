package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.Date;

public class CreateNoticiaController {

    public static boolean add(DB db, String titulo, String conteudo, Categoria categoria, String author) {
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setConteudo(conteudo);
        noticia.setCategoria(categoria);
        noticia.setAuthor(author);
        noticia.setData(new Date());
        try {
            noticia.create(db, noticia);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
