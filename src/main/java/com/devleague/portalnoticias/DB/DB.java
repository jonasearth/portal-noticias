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
    public static ArrayList<Cliente> cliente = new ArrayList<>();
    public static ArrayList<Comentario> comentario = new ArrayList<>();
    public static ArrayList<Anunciante> anunciante = new ArrayList<>();
    public static ArrayList<Anuncio> anuncio = new ArrayList<>();
    public static ArrayList<Mediador> mediador = new ArrayList<>();

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
            String jsonCliente = gson.toJson(DB.cliente);
            String jsonComentario = gson.toJson(DB.comentario);
            String jsonAnunciante = gson.toJson(DB.anunciante);
            String jsonAnuncio = gson.toJson(DB.anuncio);
            String jsonMediador = gson.toJson(DB.mediador);

            //cria arquivos de json para inserir os dados
            FileWriter wNoticias = new FileWriter(PATH+"noticias.json");
            FileWriter wCategorias = new FileWriter(PATH+"categorias.json");
            FileWriter wChefe = new FileWriter(PATH+"chefe.json");
            FileWriter wRevisor = new FileWriter(PATH+"revisor.json");
            FileWriter wEditor = new FileWriter(PATH+"editor.json");
            FileWriter wJornalista = new FileWriter(PATH+"jornalista.json");
            FileWriter wCliente = new FileWriter(PATH+"cliente.json");
            FileWriter wComentario = new FileWriter(PATH+"comentario.json");
            FileWriter wAnunciante = new FileWriter(PATH+"anunciante.json");
            FileWriter wAnuncio= new FileWriter(PATH+"anuncio.json");
            FileWriter wMediador = new FileWriter(PATH+"mediador.json");

            //insere os dados em json dentro dos arquivos
            wNoticias.write(jsonNoticia);
            wCategorias.write(jsonCategoria);
            wChefe.write(jsonChefe);
            wRevisor.write(jsonRevisor);
            wEditor.write(jsonEditor);
            wJornalista.write(jsonJornalista);
            wCliente.write(jsonCliente);
            wComentario.write(jsonComentario);
            wAnunciante.write(jsonAnunciante);
            wAnuncio.write(jsonAnuncio);
            wMediador.write(jsonMediador);

            //fecha a edição do arquivo
            wNoticias.close();
            wCategorias.close();
            wChefe.close();
            wRevisor.close();
            wEditor.close();
            wJornalista.close();
            wCliente.close();
            wComentario.close();
            wAnunciante.close();
            wAnuncio.close();
            wMediador.close();

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
        Type typeCliente = new TypeToken<ArrayList<Cliente>> () {}.getType();
        Type typeComentario = new TypeToken<ArrayList<Comentario>> () {}.getType();
        Type typeAnunciante = new TypeToken<ArrayList<Anunciante>> () {}.getType();
        Type typeAnuncio = new TypeToken<ArrayList<Anuncio>> () {}.getType();
        Type typeMediador = new TypeToken<ArrayList<Mediador>> () {}.getType();


        try {
            //ler os arquivos em json salvos
            BufferedReader rNoticia = new BufferedReader(new FileReader(PATH+"noticias.json"));
            BufferedReader rCategoria = new BufferedReader(new FileReader(PATH+"categorias.json"));
            BufferedReader rChefe = new BufferedReader(new FileReader(PATH+"chefe.json"));
            BufferedReader rRevisor = new BufferedReader(new FileReader(PATH+"revisor.json"));
            BufferedReader rEditor = new BufferedReader(new FileReader(PATH+"editor.json"));
            BufferedReader rJornalista = new BufferedReader(new FileReader(PATH+"jornalista.json"));
            BufferedReader rCliente = new BufferedReader(new FileReader(PATH+"cliente.json"));
            BufferedReader rComentario = new BufferedReader(new FileReader(PATH+"comentario.json"));
            BufferedReader rAnunciante = new BufferedReader(new FileReader(PATH+"anunciante.json"));
            BufferedReader rAnuncio = new BufferedReader(new FileReader(PATH+"anuncio.json"));
            BufferedReader rMediador = new BufferedReader(new FileReader(PATH+"mediador.json"));

            //insere o conteudo dos arquivos dentro dos arraylists
            DB.noticia = gson.fromJson(rNoticia, typeNoticia);
            DB.categoria = gson.fromJson(rCategoria, typeCategoria);
            DB.chefe = gson.fromJson(rChefe, typeChefe);
            DB.revisor = gson.fromJson(rRevisor, typeRevisor);
            DB.editor = gson.fromJson(rEditor, typeEditor);
            DB.jornalista = gson.fromJson(rJornalista, typeJornalista);
            DB.cliente = gson.fromJson(rCliente, typeCliente);
            DB.comentario = gson.fromJson(rComentario, typeComentario);
            DB.anunciante = gson.fromJson(rAnunciante, typeAnunciante);
            DB.anuncio = gson.fromJson(rAnuncio, typeAnuncio);
            DB.mediador = gson.fromJson(rMediador, typeMediador);

        } catch (IOException e) {
        }
    }

}
