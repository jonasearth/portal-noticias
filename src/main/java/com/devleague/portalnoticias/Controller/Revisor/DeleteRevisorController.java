package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

public class DeleteRevisorController {
    public static boolean delete(DB db, Revisor revisor) {
        try {
            revisor.delete(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
