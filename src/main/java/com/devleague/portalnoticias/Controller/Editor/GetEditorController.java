package com.devleague.portalnoticias.Controller.Editor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Editor;

import java.util.ArrayList;
import java.util.UUID;

public class GetEditorController {
    public static Editor get(DB db, UUID id) {
        Editor editor = new Editor();
        try {
            return editor.get(db, id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Editor> getAll(DB db) {
        Editor editor = new Editor();
        try {
            return editor.getAll(db);
        }catch (Exception e){
            return null;
        }
    }
}
