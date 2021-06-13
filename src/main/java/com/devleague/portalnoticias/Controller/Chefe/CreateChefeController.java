package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class CreateChefeController{
    public static boolean add( Chefe chefe) {
        try {
            chefe.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
