package com.devleague.portalnoticias.Controller.Mediador;

import com.devleague.portalnoticias.Model.Mediador;

public class UpdateMediadorController {

    public static boolean update(Mediador mediador) {
        try {
            mediador.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
