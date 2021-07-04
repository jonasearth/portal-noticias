package com.devleague.portalnoticias.Controller.Comentario;

import com.devleague.portalnoticias.Model.Comentario;

public class DeleteComentarioController {
    public static boolean delete(Comentario comentario) {
        try {
            comentario.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
