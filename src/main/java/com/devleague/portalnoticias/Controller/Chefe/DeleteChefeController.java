package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

public class DeleteChefeController {
    public static boolean delete(DB db, int index) {
        try {
            Chefe.delete(db, index);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
