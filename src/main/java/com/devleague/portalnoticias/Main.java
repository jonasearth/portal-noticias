package com.devleague.portalnoticias;


import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.View.CreateNoticia;

import javax.swing.*;

public class Main {

    public static DB db = new DB();
    public static void main(String[] args) {
        JFrame frame = new JFrame("CreateNoticia");
        frame.setContentPane(new CreateNoticia().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}