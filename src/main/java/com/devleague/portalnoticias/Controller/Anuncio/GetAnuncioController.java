package com.devleague.portalnoticias.Controller.Anuncio;

import com.devleague.portalnoticias.Model.Anuncio;

import java.util.ArrayList;
import java.util.UUID;

public class GetAnuncioController {
    public static Anuncio get( UUID id) {
        Anuncio anuncio = new Anuncio();
        try {
            return anuncio.get(id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Anuncio> getAll() {
        Anuncio anuncio = new Anuncio();
        try {
            return anuncio.getAll();
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Anuncio> getByAnunciante( UUID id) {
        Anuncio anuncio = new Anuncio();
        try {
            return anuncio.getByAnunciante(id);
        }catch (Exception e){
            return null;
        }
    }

}
