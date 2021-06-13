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

    //simulador de banco de dados
    public static ArrayList<Noticia> noticia = new ArrayList<>();
    public static ArrayList<Categoria> categoria = new ArrayList<>();
    public static ArrayList<Chefe> chefe = new ArrayList<>();
    public static ArrayList<Revisor> revisor = new ArrayList<>();
    public static ArrayList<Editor> editor = new ArrayList<>();
    public static ArrayList<Jornalista> jornalista = new ArrayList<>();

    private static final String PATH  = "./src/main/java/com/devleague/portalnoticias/DB/tables/";
    public static void backup (){

        Gson gson = new Gson();
        try {

            //obtem um json de cada um dos array lists
            String jsonNoticia = gson.toJson(DB.noticia);
            String jsonCategoria = gson.toJson(DB.categoria);
            String jsonChefe = gson.toJson(DB.chefe);
            String jsonRevisor = gson.toJson(DB.revisor);
            String jsonEditor = gson.toJson(DB.editor);
            String jsonJornalista = gson.toJson(DB.jornalista);

            //cria arquivos de json para inserir os dados
            FileWriter wNoticias = new FileWriter(PATH+"noticias.json");
            FileWriter wCategorias = new FileWriter(PATH+"categorias.json");
            FileWriter wChefe = new FileWriter(PATH+"chefe.json");
            FileWriter wRevisor = new FileWriter(PATH+"revisor.json");
            FileWriter wEditor = new FileWriter(PATH+"editor.json");
            FileWriter wJornalista = new FileWriter(PATH+"jornalista.json");

            //insere os dados em json dentro dos arquivos
            wNoticias.write(jsonNoticia);
            wCategorias.write(jsonCategoria);
            wChefe.write(jsonChefe);
            wRevisor.write(jsonRevisor);
            wEditor.write(jsonEditor);
            wJornalista.write(jsonJornalista);

            //fecha a edição do arquivo
            wNoticias.close();
            wCategorias.close();
            wChefe.close();
            wRevisor.close();
            wEditor.close();
            wJornalista.close();

        } catch (IOException e) {

        }
    }

    public static void restore(){
        Gson gson = new Gson();

        //obtem o tipo especifico do arraylist
        Type typeNoticia = new TypeToken<ArrayList<Noticia>> () {}.getType();
        Type typeCategoria = new TypeToken<ArrayList<Categoria>> () {}.getType();
        Type typeChefe = new TypeToken<ArrayList<Chefe>> () {}.getType();
        Type typeRevisor = new TypeToken<ArrayList<Revisor>> () {}.getType();
        Type typeEditor = new TypeToken<ArrayList<Editor>> () {}.getType();
        Type typeJornalista = new TypeToken<ArrayList<Jornalista>> () {}.getType();


        try {
            //ler os arquivos em json salvos
            BufferedReader rNoticia = new BufferedReader(new FileReader(PATH+"noticias.json"));
            BufferedReader rCategoria = new BufferedReader(new FileReader(PATH+"categorias.json"));
            BufferedReader rChefe = new BufferedReader(new FileReader(PATH+"chefe.json"));
            BufferedReader rRevisor = new BufferedReader(new FileReader(PATH+"revisor.json"));
            BufferedReader rEditor = new BufferedReader(new FileReader(PATH+"editor.json"));
            BufferedReader rJornalista = new BufferedReader(new FileReader(PATH+"jornalista.json"));

            //insere o conteudo dos arquivos dentro dos arraylists
            DB.noticia = gson.fromJson(rNoticia, typeNoticia);
            DB.categoria = gson.fromJson(rCategoria, typeCategoria);
            DB.chefe = gson.fromJson(rChefe, typeChefe);
            DB.revisor = gson.fromJson(rRevisor, typeRevisor);
            DB.editor = gson.fromJson(rEditor, typeEditor);
            DB.jornalista = gson.fromJson(rJornalista, typeJornalista);

        } catch (IOException e) {
        }
    }

}
