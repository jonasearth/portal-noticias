package com.devleague.portalnoticias.DB;

import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;

public class DB {
    public ArrayList<Noticia> noticia = new ArrayList<>();
    public ArrayList<Categoria> Categoria = new ArrayList<>();

    public  static ArrayList getDB(DB db , String table){
        ArrayList data = new ArrayList();
        switch (table){
            case "Noticia":
                data = db.noticia;
                break;
            case "Categoria":
                data = db.Categoria;
                break;
        }
        return data;
    }

}
