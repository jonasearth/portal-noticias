package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

import java.util.ArrayList;
import java.util.UUID;

public class GetRevisorController {
    public static Revisor get( UUID id) {
        Revisor revisor = new Revisor();
        try {
            return revisor.get( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Revisor> getAll() {
        Revisor revisor = new Revisor();
        try {
            return revisor.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
