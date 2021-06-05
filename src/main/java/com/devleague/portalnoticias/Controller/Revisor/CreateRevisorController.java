package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

public class CreateRevisorController {
    public static boolean add(DB db, Revisor revisor) {
        try {
            revisor.create(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
