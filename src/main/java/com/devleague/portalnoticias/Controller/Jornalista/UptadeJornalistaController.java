package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

public class UptadeJornalistaController  {
    public static boolean update( Jornalista jornalista) {
        try {
            jornalista.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
