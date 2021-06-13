package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

public class DeleteJornalistaController  {
    public static boolean delete(  Jornalista jornalista) {
        try {
            jornalista.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
