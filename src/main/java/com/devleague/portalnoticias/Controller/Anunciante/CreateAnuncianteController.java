package com.devleague.portalnoticias.Controller.Anunciante;

import com.devleague.portalnoticias.Model.Anunciante;

public class CreateAnuncianteController {
    public static boolean add(Anunciante anunciante) {
        try {
            anunciante.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
