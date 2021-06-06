package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

public class DeleteJornalistaController  {
    public static boolean delete(DB db,  Jornalista jornalista) {
        try {
            jornalista.delete(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
