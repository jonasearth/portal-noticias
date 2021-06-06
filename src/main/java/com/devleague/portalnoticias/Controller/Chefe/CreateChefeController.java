package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class CreateChefeController{
    public static boolean add(DB db, Chefe chefe) {
        try {
            chefe.create(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
