package com.devleague.portalnoticias.Controller.Editor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Editor;

public class UptadeEditorController  {
    public static boolean update( Editor editor) {
        try {
            editor.update();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
