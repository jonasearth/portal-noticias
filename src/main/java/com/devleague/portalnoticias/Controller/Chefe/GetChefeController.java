package com.devleague.portalnoticias.Controller.Chefe;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Chefe;

import java.util.ArrayList;
import java.util.UUID;

public class GetChefeController {
    public static Chefe get( UUID id) {
        Chefe chefe = new Chefe();
        try {
            return chefe.get( id);
        }catch (Exception e){
            return null;
        }
    }
    public static ArrayList<Chefe> getAll() {
        Chefe chefe = new Chefe();
        try {
            return chefe.getAll();
        }catch (Exception e){
            return null;
        }
    }
}
