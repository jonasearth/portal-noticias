package com.devleague.portalnoticias.Controller.Anunciante;

import com.devleague.portalnoticias.Model.Anunciante;

public class DeleteAnuncianteController {
    public static boolean delete(Anunciante anunciante) {
        try {
            anunciante.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
