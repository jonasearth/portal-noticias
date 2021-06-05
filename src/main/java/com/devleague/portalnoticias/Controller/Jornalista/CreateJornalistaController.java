package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

public class CreateJornalistaController {
    public static boolean add(DB db, Jornalista jornalista) {
        try {
            jornalista.create(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
