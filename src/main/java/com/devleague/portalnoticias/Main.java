package com.devleague.portalnoticias;


import com.devleague.portalnoticias.Controller.Noticia.GetNoticiaController;
import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.View.Visualizador;

public class Main {

    public static DB db = new DB();
    public static void main(String[] args) {
        GetNoticiaController.get(db, 0);
        Visualizador.exibir();
        System.out.println("Qualquer mensagem");
    }
}
