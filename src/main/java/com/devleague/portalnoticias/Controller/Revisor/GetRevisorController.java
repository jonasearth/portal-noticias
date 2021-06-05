package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

import java.util.ArrayList;
import java.util.UUID;

public class GetRevisorController {
    public static Revisor get(DB db, UUID id) {
        Revisor categoria = new Revisor();
        try {
            return revisor.get(db, id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Revisor> getAll(DB db) {
        Revisor revisor = new Revisor();
        try {
            return revisor.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
}
