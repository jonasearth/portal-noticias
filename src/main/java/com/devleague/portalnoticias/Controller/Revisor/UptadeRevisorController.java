package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

public class UptadeRevisorController {
    public static boolean update(DB db, Revisor revisor) {
        try {
            revisor.update(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
