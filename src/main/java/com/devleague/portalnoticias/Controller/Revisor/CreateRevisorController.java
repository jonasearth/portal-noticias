package com.devleague.portalnoticias.Controller.Revisor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Revisor;

public class CreateRevisorController {
    public static boolean add( Revisor revisor) {
        try {
            revisor.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
