package com.devleague.portalnoticias.Controller.Mediador;

import com.devleague.portalnoticias.Model.Mediador;

public class CreateMediadorController {
    public static boolean add(Mediador categoria) {
        try {
            categoria.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
