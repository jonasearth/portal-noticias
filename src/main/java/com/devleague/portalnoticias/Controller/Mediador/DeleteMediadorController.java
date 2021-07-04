package com.devleague.portalnoticias.Controller.Mediador;

import com.devleague.portalnoticias.Model.Mediador;

public class DeleteMediadorController {
    public static boolean delete(Mediador mediador) {
        try {
            mediador.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
