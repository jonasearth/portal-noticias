package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class UptadeChefeController {
    public static boolean update(DB db, Chefe chefe) {
    try {
        chefe.update(db);
        return true;
    }catch (Exception e){
        return false;
    }
}
}
