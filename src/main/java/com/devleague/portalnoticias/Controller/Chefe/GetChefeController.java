package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

import java.util.ArrayList;
import java.util.UUID;

public class GetChefeController {
    public static Chefe get(DB db, UUID id) {
        Chefe chefe = new Chefe();
        try {
            return categoria.get(db, id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Chefe> getAll(DB db) {
        Chefe categoria = new Chefe();
        try {
            return chefe.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
}
