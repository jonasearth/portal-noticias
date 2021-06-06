package com.devleague.portalnoticias;


import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.DB.ProcessoBackup;
import com.devleague.portalnoticias.View.Jornalista;
import com.devleague.portalnoticias.View.Acesso;
import com.devleague.portalnoticias.View.ViewJornalista.ListaJornalistas;
import com.devleague.portalnoticias.View.ViewRevisor.PageEnviarErro;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class Main {

    public static DB db = new DB();
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        FlatLightLaf.setup();
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        db.restore();


        new ListaJornalistas(db).setVisible(true);
        try
        {
           new ProcessoBackup(db);
        }catch (InterruptedException e){

        }

    }
}