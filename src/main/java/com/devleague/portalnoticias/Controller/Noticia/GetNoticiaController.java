package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;

public class GetNoticiaController {

    public static Noticia get(DB db, int index) {
        try {
            return Noticia.get(db, index);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getAll(DB db) {
        try {
            return Noticia.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
}