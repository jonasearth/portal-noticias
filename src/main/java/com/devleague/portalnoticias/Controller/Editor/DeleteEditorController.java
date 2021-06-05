package com.devleague.portalnoticias.Controller.Editor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Editor;

public class DeleteEditorController {
    public static boolean delete(DB db, Editor editor) {
        try {
            editor.delete(db);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
