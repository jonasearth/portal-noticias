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
            System.out.println("1- Adicionar Noticia");
            System.out.println("2- Listar Noticias");
            System.out.println("0- se quiser sair do programa");
            espaco();

            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    criarNoticia();
                    break;
                case 2:
                    buscarNoticias();
                    System.out.println("Escolha a publicação");
                    Scanner inputNoticia = new Scanner(System.in);
                    int index = inputNoticia.nextInt();
                    opcoesNoticia(index);
                    break;
                default:
                    System.out.println("Programa sera fechado :(");
                    System.exit(0);
                    break;
            }

        }
    }

    public static void criarNoticia() {
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

    public static void buscarNoticias() {
        ArrayList<Noticia> noticias = GetNoticiaController.getAll(db);
        for (int i = 0; i < noticias.size(); i++)
            System.out.println(i + " - " + noticias.get(i).getTitulo());


    }

    public static void visualizarNoticia(int index) {
        Noticia noticia = GetNoticiaController.get(db, index);
        if (noticia == null) {
            System.out.println("Noticia não encontrada");
            return;
        }
        System.out.println("Título: " + noticia.getTitulo());
        System.out.println("Autor: " + noticia.getAuthor());
        System.out.println("Categoria: " + noticia.getCategoria());
        espaco();
        System.out.println("Conteudo: " + noticia.getConteudo());
    }

    public static void editarNoticia(int index) {
        Noticia noticia = GetNoticiaController.get(db, index);
        if (noticia == null) {
            System.out.println("Noticia não encontrada");
            return;
        }

        while (true) {
            espaco();
            System.out.println("Editar publicação!");
            System.out.println("1- Alterar Autor");
            System.out.println("2- Alterar Título");
            System.out.println("3- Alterar Categoria");
            System.out.println("4- Alterar Conteudo");
            System.out.println("0- Finalizar edição");
            espaco();

            Scanner input = new Scanner(System.in);
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Autor: ");
                    Scanner inputAutor = new Scanner(System.in);
                    String autor = inputAutor.nextLine();
                    noticia.setAuthor(autor);
                    break;
                case 2:
                    System.out.print("Titulo: ");
                    Scanner inputTitulo = new Scanner(System.in);
                    String titulo = inputTitulo.nextLine();
                    noticia.setTitulo(titulo);
                    break;
                case 3:
                    System.out.print("Categoria: ");
                    Scanner inputCategoria = new Scanner(System.in);
                    String categoria = inputCategoria.nextLine();
                    noticia.setCategoria(categoria);
                    break;
                case 4:
                    System.out.print("Conteudo: ");
                    Scanner inputConteudo = new Scanner(System.in);
                    String conteudo = inputConteudo.nextLine();
                    noticia.setConteudo(conteudo);
                    break;
                default:
                    System.out.println("Alteraões finalizadas");
                    return;
            }
            ;
            UpdateNoticiaController.update(db, index, noticia);
        }

    }

    public static void deletarNoticia(int index) {
        boolean deleted = DeleteNoticiaController.delete(db, index);
        if (deleted) {
            System.out.println("Noticia Deletada com sucesso");
            return;
        } else {
            System.out.println("Noticia Não pôde ser deletada");
            return;
        }
    }

    public static void opcoesNoticia(int index) {
        Scanner input = new Scanner(System.in);
        espaco();
        System.out.println("Publicação");
        System.out.println("1- Visualizar Noticia");
        System.out.println("2- Editar Noticia");
        System.out.println("3- Deletar Noticia");
        System.out.println("0- Sair de publicações");
        espaco();

        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                visualizarNoticia(index);
                break;
            case 2:
                editarNoticia(index);
                break;
            case 3:
                deletarNoticia(index);
                break;
            default:
                break;
        }
    }
}
