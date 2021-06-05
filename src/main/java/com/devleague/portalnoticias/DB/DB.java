package com.devleague.portalnoticias.DB;


import com.devleague.portalnoticias.Model.*;
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
    public ArrayList<Revisor> revisor = new ArrayList<>();
    public ArrayList<Editor> editor = new ArrayList<>();
    public ArrayList<Jornalista> jornalista = new ArrayList<>();

    private static final String PATH  = "./src/main/java/com/devleague/portalnoticias/DB/tables/";
    public void backup (){

        Gson gson = new Gson();
        try {

            String jsonNoticia = gson.toJson(this.noticia);
            String jsonCategoria = gson.toJson(this.categoria);
            String jsonChefe = gson.toJson(this.chefe);
            String jsonRevisor = gson.toJson(this.revisor);
            String jsonEditor = gson.toJson(this.editor);
            String jsonJornalista = gson.toJson(this.jornalista);

            FileWriter wNoticias = new FileWriter(PATH+"noticias.json");
            FileWriter wCategorias = new FileWriter(PATH+"categorias.json");
            FileWriter wChefe = new FileWriter(PATH+"chefe.json");
            FileWriter wRevisor = new FileWriter(PATH+"revisor.json");
            FileWriter wEditor = new FileWriter(PATH+"editor.json");
            FileWriter wJornalista = new FileWriter(PATH+"jornalista.json");

            wNoticias.write(jsonNoticia);
            wCategorias.write(jsonCategoria);
            wChefe.write(jsonChefe);
            wRevisor.write(jsonRevisor);
            wEditor.write(jsonEditor);
            wJornalista.write(jsonJornalista);

            wNoticias.close();
            wCategorias.close();
            wChefe.close();
            wRevisor.close();
            wEditor.close();
            wJornalista.close();

        } catch (IOException e) {

        }
    }

    public void restore(){
        Gson gson = new Gson();

        Type typeNoticia = new TypeToken<ArrayList<Noticia>> () {}.getType();
        Type typeCategoria = new TypeToken<ArrayList<Categoria>> () {}.getType();
        Type typeChefe = new TypeToken<ArrayList<Chefe>> () {}.getType();
        Type typeRevisor = new TypeToken<ArrayList<Revisor>> () {}.getType();
        Type typeEditor = new TypeToken<ArrayList<Editor>> () {}.getType();
        Type typeJornalista = new TypeToken<ArrayList<Jornalista>> () {}.getType();


        try {
            BufferedReader rNoticia = new BufferedReader(new FileReader(PATH+"noticias.json"));
            BufferedReader rCategoria = new BufferedReader(new FileReader(PATH+"categorias.json"));
            BufferedReader rChefe = new BufferedReader(new FileReader(PATH+"chefe.json"));
            BufferedReader rRevisor = new BufferedReader(new FileReader(PATH+"revisor.json"));
            BufferedReader rEditor = new BufferedReader(new FileReader(PATH+"editor.json"));
            BufferedReader rJornalista = new BufferedReader(new FileReader(PATH+"jornalista.json"));

            this.noticia = gson.fromJson(rNoticia, typeNoticia);
            this.categoria = gson.fromJson(rCategoria, typeCategoria);
            this.chefe = gson.fromJson(rChefe, typeChefe);
            this.revisor = gson.fromJson(rRevisor, typeRevisor);
            this.editor = gson.fromJson(rEditor, typeEditor);
            this.jornalista = gson.fromJson(rJornalista, typeJornalista);

        } catch (IOException e) {
        }
    }

}
