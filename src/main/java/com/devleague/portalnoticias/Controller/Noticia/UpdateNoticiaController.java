package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.UUID;

public class UpdateNoticiaController {

    public static boolean update(Noticia noticia) {
        try {
            noticia.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static boolean addError(Noticia noticia, UUID id) {
        try {
            noticia.addError(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static boolean addComment(Noticia noticia, UUID id) {
        try {
            noticia.addComment(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
