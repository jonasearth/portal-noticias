package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

public class UptadeJornalistaController  {
    public static boolean update(DB db, Jornalista jornalista) {
        try {
            jornalista.update(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
