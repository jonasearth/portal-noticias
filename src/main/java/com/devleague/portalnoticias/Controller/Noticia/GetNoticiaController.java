package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;
import java.util.UUID;

public class GetNoticiaController  {

    public static Noticia get(DB db, UUID id) {
        Noticia noticia = new Noticia();
        try {
            return noticia.get(db, id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getAll(DB db) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getByChefe(DB db, UUID id) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getByChefe(db, id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getByCategory(DB db, UUID id) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getByCategory(db, id);
        }catch (Exception e){
            return null;
        }
    }
//    public static ArrayList<Noticia> getRevised(DB db) {
//        Noticia noticia = new Noticia();
//        try {
//            return noticia.getRevised(db);
//        } catch (Exception e) {
//            return null;
//        }
//    }
}
