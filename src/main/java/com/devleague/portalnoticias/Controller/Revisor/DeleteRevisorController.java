package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

public class DeleteRevisorController {
    public static boolean delete(Revisor revisor) {
        try {
            revisor.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
