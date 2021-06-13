package com.devleague.portalnoticias.Controller.Editor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Editor;

public class CreateEditorController {
    public static boolean add( Editor editor) {
        try {
            editor.create();
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
