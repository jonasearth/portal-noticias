package com.devleague.portalnoticias.Controller.Anunciante;

import com.devleague.portalnoticias.Model.Anunciante;

public class UpdateAnuncianteController {

    public static boolean update(Anunciante anunciante) {
        try {
            anunciante.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
