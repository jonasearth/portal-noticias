package com.devleague.portalnoticias.Controller.Editor;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Editor;

import java.util.ArrayList;
import java.util.UUID;

public class GetEditorController {
    public static Editor get( UUID id) {
        Editor editor = new Editor();
        try {
            return editor.get( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Editor> getAll() {
        Editor editor = new Editor();
        try {
            return editor.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
