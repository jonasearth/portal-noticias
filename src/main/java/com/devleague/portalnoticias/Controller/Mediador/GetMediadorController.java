package com.devleague.portalnoticias.Controller.Mediador;

import com.devleague.portalnoticias.Model.Mediador;

import java.util.ArrayList;
import java.util.UUID;

public class GetMediadorController {
    public static Mediador get( UUID id) {
        Mediador mediador = new Mediador();
        try {
            return mediador.get(id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Mediador> getAll() {
        Mediador mediador = new Mediador();
        try {
            return mediador.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
