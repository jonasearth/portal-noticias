package com.devleague.portalnoticias.Controller.Comentario;

import com.devleague.portalnoticias.Model.Comentario;

public class CreateComentarioController {
    public static boolean add(Comentario comentario) {
        try {
            comentario.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
