package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando entrada de dados
        Scanner sc = new Scanner(System.in);

        // Intanciando estante
        Estante estante = new Estante(32,'b');

        boolean flag = true; // Controle de dados

        while (flag) {
            System.out.println("--- BEM VINDO a estante"+estante.idEstante + " ---");
            System.out.println("1 - Adicionar livros");
            System.out.println("2 - Mostrar informações da estante de livros");
            System.out.println("3 - Apresentar porcentagem de cada genero");
            System.out.println("4 - Mostrar livro com mais paginas e livro com menos");
            System.out.println("5 - Sair do sistema");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Titutlo do livro: ");
                    String titu = sc.nextLine();

                    System.out.println("Genero do livro: ");
                    String gen = sc.nextLine();

                    System.out.println("Qnt de folhas: ");
                    int qntf = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Editora: ");
                    String edit = sc.nextLine();

                    System.out.println("Nome Autor: ");
                    String name = sc.nextLine();

                    System.out.println("Nascimento autor: ");
                    int nasc = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Profisao do autor: ");
                    String prof = sc.nextLine();

                    // Criando um autor
                    Autor autor = new Autor(name,nasc,prof);

                    // Criando um livro
                    Livro livro = new Livro(titu,gen,qntf,edit,autor);

                    // Adicionando um livro na estante
                    estante.addLivros(livro);
                    break;

                case 2:
                    estante.mostrarInfos();
                    break;

                case 3:
                    estante.porcentagemGen();
                    break;

                case 4:
                    estante.livroMaisEMenosPag();
                    break;

                case 5:
                    System.out.println("SESSÃO ENCERRADA!");
                    flag = false;
                    break;

                default:
                    System.out.println("OPERAÇÃO INVALIDA");
            }
        }
        sc.close();
    }
}