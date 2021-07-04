package com.devleague.portalnoticias.Controller.Anuncio;

import com.devleague.portalnoticias.Model.Anuncio;

public class CreateAnuncioController {
    public static boolean add(Anuncio anuncio) {
        try {
            anuncio.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
