package com.devleague.portalnoticias.Controller.ErrosNoticia;

import com.devleague.portalnoticias.Model.ErrosNoticia;

public class CreateErrosNoticiaController {
    public static boolean add( ErrosNoticia errosNoticia) {
        try {
            errosNoticia.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
