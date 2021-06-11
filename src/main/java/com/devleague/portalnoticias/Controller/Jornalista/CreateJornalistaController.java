package com.devleague.portalnoticias.Controller.Jornalista;

import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Jornalista;

public class CreateJornalistaController {
    //recebe 2 parametros do view , o db e jornalista
    public static boolean add(DB db, Jornalista jornalista) {
        //previne quebra da aplicação por possiveis erros que possam existir no model
        try {
            //tenta adicionar o jornalista ao banco de dados
            jornalista.create(db);
            return true;
        }catch (Exception e){
            //retorna false caso algum erro aconteça
            return false;
        }
    }
}
