package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class DeleteChefeController {
    public static boolean delete( Chefe chefe) {
        try {
            chefe.delete();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
