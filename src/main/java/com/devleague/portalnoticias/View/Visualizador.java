package com.devleague.portalnoticias.View;

import com.devleague.portalnoticias.Controller.Noticia.CreateNoticiaController;
import com.devleague.portalnoticias.Controller.Noticia.DeleteNoticiaController;
import com.devleague.portalnoticias.Controller.Noticia.GetNoticiaController;
import com.devleague.portalnoticias.Controller.Noticia.UpdateNoticiaController;
import com.devleague.portalnoticias.DB.DB;
import com.devleague.portalnoticias.Model.Noticia;

import java.util.ArrayList;
import java.util.Scanner;

public class Visualizador {

    public static DB db = new DB();

    public static void espaco() {
        System.out.println("===================================================");
    }

    public static void exibir() {

        while (true) {
            Scanner input = new Scanner(System.in);
            espaco();
            System.out.println("Bem vindo portal!");
            System.out.println("1- Adicionar Publicacao");
            System.out.println("2- Listar Publicacoes");
            System.out.println("0- se quiser sair do programa");
            espaco();

            int escolha = input.nextInt();

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

    public static void criarPublicacao() {
        Scanner input = new Scanner(System.in);

        System.out.println("Autor: ");
        String autor = input.nextLine();

        System.out.println("Titulo: ");
        String titulo = input.nextLine();

        System.out.println("Categoria: ");
        String categoria = input.nextLine();

        System.out.println("Conteudo: ");
        String conteudo = input.nextLine();

        CreateNoticiaController.add(db, titulo, conteudo, categoria, autor);

    }

    public static void buscarPublicacoes() {
        ArrayList<Noticia> noticias = GetNoticiaController.getAll(db);
        for (int i = 0; i < noticias.size(); i++)
            System.out.println(i + " - " + noticias.get(i).getTitulo());


    }

    public static void visualizarPublicacao(int index) {
        Noticia noticia = GetNoticiaController.get(db, index);
        if (noticia == null) {
            System.out.println("Noticia não encontrada");
            return;
        }
        System.out.println(noticia.getTitulo());
        System.out.println(noticia.getAuthor());
        System.out.println(noticia.getCategoria());
        System.out.println(noticia.getConteudo());
    }

    public static void editarPublicacao(int index) {
        Noticia noticia = GetNoticiaController.get(db, index);
        if (noticia == null) {
            System.out.println("Noticia não encontrada");
            return;
        }
        espaco();
        System.out.println("Editar publicação!");
        System.out.println("1- Alterar Autor");
        System.out.println("2- Alterar Título");
        System.out.println("3- Alterar Publicação");
        System.out.println("4- Alterar Conteudo");
        System.out.println("0- Finalizar edição");
        espaco();
        boolean loop = true;
        while (loop) {
            Scanner input = new Scanner(System.in);
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    String autor = input.nextLine();
                    noticia.setAuthor(autor);
                    break;
                case 2:
                    String titulo = input.nextLine();
                    noticia.setTitulo(titulo);
                    break;
                case 3:
                    String categoria = input.nextLine();
                    noticia.setCategoria(categoria);
                    break;
                case 4:
                    String conteudo = input.nextLine();
                    noticia.setConteudo(conteudo);
                    break;
                default:
                    loop = false;
                    break;
            }
        }

        UpdateNoticiaController.update(db, index, noticia);

    }

    public static void deletarPublicacao(int index) {
        boolean deleted = DeleteNoticiaController.delete(db, index);
        if (deleted) {
            System.out.println("Noticia Deletada com sucesso");
            return;
        } else {
            System.out.println("Noticia Não pôde ser deletada");
            return;
        }
    }

    public static void opcoesPublicacao(int index) {
        Scanner input = new Scanner(System.in);
        espaco();
        System.out.println("Publicação");
        System.out.println("1- Visualizar Publicacao");
        System.out.println("2- Editar Publicacao");
        System.out.println("3- Deletar Publicacao");
        System.out.println("0- Sair de publicações");
        espaco();
        
        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Index da noticia");
//                int index = input.nextInt();
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
