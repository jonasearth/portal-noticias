package com.devleague.portalnoticias.Controller.Comentario;

import com.devleague.portalnoticias.Model.Comentario;

import java.util.ArrayList;
import java.util.UUID;

public class GetComentarioController {
    public static Comentario get( UUID id) {
        Comentario comentario = new Comentario();
        try {
            return comentario.get(id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Comentario> getAll() {
        Comentario comentario = new Comentario();
        try {
            return comentario.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
