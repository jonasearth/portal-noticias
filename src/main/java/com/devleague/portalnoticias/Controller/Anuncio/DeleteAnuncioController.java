package com.devleague.portalnoticias.Controller.Anuncio;

import com.devleague.portalnoticias.Model.Anuncio;

public class DeleteAnuncioController {
    public static boolean delete(Anuncio anuncio) {
        try {
            anuncio.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
