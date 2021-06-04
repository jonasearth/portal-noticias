package com.devleague.portalnoticias;


import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.View.Acesso;

import javax.swing.*;

public class Main {

    public static DB db = new DB();
    public static void main(String[] args) {
        db.restore();
        new Acesso(db).setVisible(true);
        System.out.println("Aaaaaaa");
       db.backup();
    }
}