package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

import java.util.ArrayList;
import java.util.UUID;

public class GetJornalistaController  {
    public static Jornalista get(DB db, UUID id) {
        Jornalista jornalista = new Jornalista();
        try {
            return jornalista.get(db, id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Jornalista> getAll(DB db) {
        Jornalista jornalista = new Jornalista();
        try {
            return jornalista.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
//    public static Jornalista getEdited(DB db) {
//        Jornalista jornalista = new Jornalista();
//        try {
//            return jornalista.getEdited(db);
//        } catch (Exception e) {
//            return null;
//        }
//    }
}
