package com.devleague.portalnoticias;


import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.DB.ProcessoBackup;
import com.devleague.portalnoticias.View.Acesso;
import com.devleague.portalnoticias.Controller.Noticia.CreateNoticiaController;
import com.devleague.portalnoticias.Model.Noticia;
import com.devleague.portalnoticias.View.ViewEditor.PageEditor;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class Main {


    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        FlatLightLaf.setup();
        try {
            UIManager.setLookAndFeel( new FlatDarculaLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
             DB.restore();
            new Acesso().setVisible(true);
            //new PageEditor(db).setVisible(true);
        try
        {
           new ProcessoBackup();
        }catch (InterruptedException e){

        }

    }
}