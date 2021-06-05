package com.devleague.portalnoticias.Controller.Editor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Editor;

public class UptadeEditorController {
    public static boolean update(DB db, Editor editor) {
        try {
            editor.update(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
