package com.devleague.portalnoticias;


import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.DB.ProcessoBackup;
import com.devleague.portalnoticias.View.Jornalista;
import com.devleague.portalnoticias.View.Acesso;
import com.devleague.portalnoticias.View.ViewJornalista.ListaJornalistas;
import com.devleague.portalnoticias.View.ViewRevisor.PageEnviarErro;

import javax.swing.*;

public class Main {

    public static DB db = new DB();
    public static void main(String[] args) {
        db.restore();
        new ListaJornalistas(db).setVisible(true);
        try
        {
           new ProcessoBackup(db);
        }catch (InterruptedException e){

        }

    }
}