package com.devleague.portalnoticias.Controller.ErrosNoticia;

import com.devleague.portalnoticias.Model.ErrosNoticia;

public class DeleteErrosNoticiaController {
    public static boolean delete( ErrosNoticia errosNoticia) {
        try {
            errosNoticia.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
