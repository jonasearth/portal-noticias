package com.devleague.portalnoticias.Controller.ErrosNoticia;

import com.devleague.portalnoticias.Model.ErrosNoticia;

import java.util.ArrayList;
import java.util.UUID;

public class GetErrosNoticiaController {
    public static ErrosNoticia get( UUID id) {
        ErrosNoticia errosNoticia = new ErrosNoticia();
        try {
            return errosNoticia.get( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<ErrosNoticia> getAll() {
        ErrosNoticia errosNoticia = new ErrosNoticia();
        try {
            return errosNoticia.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
