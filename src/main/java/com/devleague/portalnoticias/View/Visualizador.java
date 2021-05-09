package com.devleague.portalnoticias.View;

import com.devleague.portalnoticias.Controller.Noticia.CreateNoticiaController;
import com.devleague.portalnoticias.Controller.Noticia.DeleteNoticiaController;
import com.devleague.portalnoticias.Controller.Noticia.GetNoticiaController;
import com.devleague.portalnoticias.Controller.Noticia.UpdateNoticiaController;
import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Visualizador {

    public static DB db = new DB();

    public static void espaco(){
        System.out.println("===================================================");
    }

    public static void exibir(){

        while (true) {
            Scanner input = new Scanner(System.in);
            espaco();
            System.out.println("Bem vindo portal!");
            System.out.println("1- Adicionar Publicacao");
            System.out.println("2- Listar Publicacoes");
            System.out.println("0- se quiser sair do programa");
            espaco();

            int escolha = input.nextInt();
            // input.close();

            switch (escolha) {
                case 1:
                    criarPublicacao();
                    break;
                case 2:
                    buscarPublicacoes();
                    System.out.println("Escolha a publicação");
                    Scanner inputPublicacao = new Scanner(System.in);
                    int index = inputPublicacao.nextInt();
                    opcoesPublicacao(index);
                    break;
                default:
                    System.out.println("Programa sera fechado :(");
                    System.exit(0);
                    break;
            }

        }
    }

    public static void criarPublicacao(){
        Scanner input = new Scanner(System.in);
//        Map<String, String> publicacao = new HashMap<String, String>();

        System.out.println("Autor: ");
        String autor = input.nextLine();
//        publicacao.put("autor", autor);

        System.out.println("Titulo: ");
        String titulo = input.nextLine();
//        publicacao.put("titulo", titulo);

        System.out.println("Categoria: ");
        String categoria = input.nextLine();
//        publicacao.put("categoria", categoria);

        System.out.println("Conteudo: ");
        String conteudo = input.nextLine();
//        publicacao.put("conteudo", conteudo);
        CreateNoticiaController.add(db,titulo, conteudo, categoria, autor);

    }
    public static void buscarPublicacoes(){
        ArrayList<Noticia> noticias =  GetNoticiaController.getAll(db);
        for(int i = 0; i < noticias.size() ; i++)
            System.out.println(i + " - "+noticias.get(i).getTitulo());


    }
    public static void visualizarPublicacao(int index){
        Noticia noticia =  GetNoticiaController.get(db, index);
        if (noticia == null){
            System.out.println("Noticia não encontrada");
            return;
        }else{
            //visualização dos dados
        }
    }
    public static void editarPublicacao(int index){
        Noticia noticia =  GetNoticiaController.get(db, index);
        if (noticia == null){
            System.out.println("Noticia não encontrada");
            return;
        }else{
            UpdateNoticiaController.update(db,index, noticia);
        }
    }
    public static void deletarPublicacao(int index){
        boolean deleted =  DeleteNoticiaController.delete(db, index);
        if (deleted){
            System.out.println("Noticia Deletada com sucesso");
            return;
        }else{
            System.out.println("Noticia Não pôde ser deletada");
            return;
        }
    }
    public static void opcoesPublicacao(int index){
        Scanner input = new Scanner(System.in);
        espaco();
        System.out.println("O que fazer com a publicação!");
        System.out.println("1- Visualizar Publicacao");
        System.out.println("2- Editar Publicacao");
        System.out.println("3- Deletar Publicacao");
        System.out.println("0- se quiser sair do programa");
        espaco();

        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                visualizarPublicacao(escolha);
                break;
            case 2:
                editarPublicacao(escolha);
                break;
            case 3:
                deletarPublicacao(escolha);
                break;
            default:
                break;
        }
    }
}
