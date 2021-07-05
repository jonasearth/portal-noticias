package com.devleague.portalnoticias.Controller.ErrosNoticia;

import com.devleague.portalnoticias.Model.Editor;

public class UptadeErrosNoticiaController {
    public static boolean update( Editor editor) {
        try {
            editor.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
