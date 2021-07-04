package com.devleague.portalnoticias.Controller.Comentario;

import com.devleague.portalnoticias.Model.Comentario;

public class UpdateComentarioController {

    public static boolean update(Comentario comentario) {
        try {
            comentario.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
