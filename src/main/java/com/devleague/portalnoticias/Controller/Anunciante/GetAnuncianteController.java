package com.devleague.portalnoticias.Controller.Anunciante;

import com.devleague.portalnoticias.Model.Anunciante;

import java.util.ArrayList;
import java.util.UUID;

public class GetAnuncianteController {
    public static Anunciante get( UUID id) {
        Anunciante anunciante = new Anunciante();
        try {
            return anunciante.get(id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Anunciante> getAll() {
        Anunciante anunciante = new Anunciante();
        try {
            return anunciante.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
