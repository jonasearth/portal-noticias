package com.devleague.portalnoticias.DB;


import com.devleague.portalnoticias.Model.Categoria;
import com.devleague.portalnoticias.Model.Chefe;
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
    public ArrayList<Chefe> chefe = new ArrayList<>();

    private static final String PATH  = "./src\\main\\java\\com\\devleague\\portalnoticias\\DB\\tables\\";
//    private static final String PATH  = "./src/main/java/com/devleague/portalnoticias/DB/tables/";
    public void backup (){

        Gson gson = new Gson();
        try {

            String jsonNoticia = gson.toJson(this.noticia);
            String jsonCategoria = gson.toJson(this.categoria);
            String jsonChefe = gson.toJson(this.chefe);

            FileWriter wNoticias = new FileWriter(PATH+"noticias.json");
            FileWriter wCategorias = new FileWriter(PATH+"categorias.json");
            FileWriter wChefe = new FileWriter(PATH+"chefe.json");

            wNoticias.write(jsonNoticia);
            wCategorias.write(jsonCategoria);
            wChefe.write(jsonChefe);

            wNoticias.close();
            wCategorias.close();
            wChefe.close();

        } catch (IOException e) {

        }
    }

    public void restore(){
        Gson gson = new Gson();

        Type typeNoticia = new TypeToken<ArrayList<Noticia>> () {}.getType();
        Type typeCategoria = new TypeToken<ArrayList<Categoria>> () {}.getType();
        Type typeChefe = new TypeToken<ArrayList<Chefe>> () {}.getType();


        try {
            BufferedReader rNoticia = new BufferedReader(new FileReader(PATH+"noticias.json"));
            BufferedReader rCategoria = new BufferedReader(new FileReader(PATH+"categorias.json"));
            BufferedReader rChefe = new BufferedReader(new FileReader(PATH+"chefe.json"));

            this.noticia = gson.fromJson(rNoticia, typeNoticia);
            this.categoria = gson.fromJson(rCategoria, typeCategoria);
            this.chefe = gson.fromJson(rChefe, typeChefe);

        } catch (IOException e) {
        }
    }

}
