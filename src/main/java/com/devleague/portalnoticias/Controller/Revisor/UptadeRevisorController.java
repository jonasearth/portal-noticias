package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

public class UptadeRevisorController {
    public static boolean update(Revisor revisor) {
        try {
            revisor.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
