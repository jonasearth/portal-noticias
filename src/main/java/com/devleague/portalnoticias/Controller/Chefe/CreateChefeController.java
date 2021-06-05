package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class CreateChefeController {
    public static boolean add(DB db, String nome) {
        Chefe chefe = new Chefe(nome);
        try {
            Chefe.create(db, chefe);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
