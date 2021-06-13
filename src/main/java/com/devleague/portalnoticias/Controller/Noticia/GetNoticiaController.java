package com.devleague.portalnoticias.Controller.Noticia;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;
import java.util.UUID;

public class GetNoticiaController  {

    public static Noticia get(UUID id) {
        Noticia noticia = new Noticia();
        try {
            return noticia.get( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getAll( ) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getAll();
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getByChefe( UUID id) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getByChefe( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getByCategory(UUID id) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getByCategory( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Noticia> getRevised( ) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getRevised();
        } catch (Exception e) {
            return null;
        }
    }
    public static ArrayList<Noticia> getEdited( ) {
        Noticia noticia = new Noticia();
        try {
            return noticia.getEdited();
        } catch (Exception e) {
            return null;
        }
    }
}
