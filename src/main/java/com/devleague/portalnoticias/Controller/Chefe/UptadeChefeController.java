package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class UptadeChefeController {
    public static boolean update( Chefe chefe) {
    try {
        chefe.update();
        return true;
    }catch (Exception e){
        return false;
    }
}
}
