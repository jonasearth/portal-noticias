package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

import java.util.ArrayList;
import java.util.UUID;

public class GetJornalistaController  {
    public static Jornalista get( UUID id) {
        Jornalista jornalista = new Jornalista();
        try {
            return jornalista.get( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Jornalista> getAll() {
        Jornalista jornalista = new Jornalista();
        try {
            return jornalista.getAll();
        }catch (Exception e){
            return null;
        }
    }

}
