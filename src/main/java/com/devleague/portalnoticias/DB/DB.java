package com.devleague.portalnoticias.DB;


import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Noticia;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class DB {
    public ArrayList<Noticia> noticia = new ArrayList<>();
    public ArrayList<Categoria> categoria = new ArrayList<>();

    private static final String PATH  = "./src\\main\\java\\com\\devleague\\portalnoticias\\DB\\tables\\";
//    private static final String PATH  = "./src/main/java/com/devleague/portalnoticias/DB/tables/";
    public void backup (){

        Gson gson = new Gson();
        try {

            String jsonNoticia = gson.toJson(this.noticia);
            String jsonCategoria = gson.toJson(this.categoria);

            FileWriter wNoticias = new FileWriter(PATH+"noticias.json");
            FileWriter wCategorias = new FileWriter(PATH+"categorias.json");

            wNoticias.write(jsonNoticia);
            wCategorias.write(jsonCategoria);

            wNoticias.close();
            wCategorias.close();

        } catch (IOException e) {

        }
    }

    public void restore(){
        Gson gson = new Gson();

        Type typeNoticia = new TypeToken<ArrayList<Noticia>> () {}.getType();
        Type typeCategoria = new TypeToken<ArrayList<Categoria>> () {}.getType();


        try {
            BufferedReader rNoticia = new BufferedReader(new FileReader(PATH+"noticias.json"));
            BufferedReader rCategoria = new BufferedReader(new FileReader(PATH+"categorias.json"));

            this.noticia = gson.fromJson(rNoticia, typeNoticia);
            this.categoria = gson.fromJson(rCategoria, typeCategoria);

        } catch (IOException e) {
        }
    }

}
