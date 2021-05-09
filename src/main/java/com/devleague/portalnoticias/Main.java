package com.devleague.portalnoticias;


import com.devleague.portalnoticias.Controller.Noticia.GetNoticiaController;
import com.devleague.portalnoticias.DB.DB;

public class Main {

    public static DB db = new DB();
    public static void main(String[] args) {
        GetNoticiaController.get(db, 0);

    }
}
