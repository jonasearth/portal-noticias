package com.devleague.portalnoticias.View;

import com.devleague.portalnoticias.Controller.Noticia.CreateNoticiaController;
import com.devleague.portalnoticias.DB.DB;

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
                default:
                    System.out.println("Programa sera fechado :(");
                    System.exit(0);
                    break;
            }

        }
    }

    public static void criarPublicacao(){
        Scanner input = new Scanner(System.in);
        Map<String, String> publicacao = new HashMap<String, String>();

        System.out.println("Autor: ");
        String autor = input.nextLine();
        publicacao.put("autor", autor);

        System.out.println("Titulo: ");
        String titulo = input.nextLine();
        publicacao.put("titulo", titulo);

        System.out.println("Categoria: ");
        String categoria = input.nextLine();
        publicacao.put("categoria", categoria);

        System.out.println("Conteudo: ");
        String conteudo = input.nextLine();
        publicacao.put("conteudo", conteudo);
        CreateNoticiaController.add(db,titulo, conteudo, categoria, autor);

        System.out.println(publicacao.get("autor"));


    }
}
