package com.devleague.portalnoticias.Controller.Anuncio;

import com.devleague.portalnoticias.Model.Anuncio;

public class UpdateAnuncioController {

    public static boolean update(Anuncio anuncio) {
        try {
            anuncio.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
