package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando entrada de dados
        Scanner sc = new Scanner(System.in);

        // Instanciando imobiliaria
        Imobiliaria imobiliaria = new Imobiliaria("PEDRAO IMOVEIS",
                "3455589","Santa rita");

        boolean flag = true; // Controle de dados

        while (flag){
            System.out.println("--- BEM VINDO "+imobiliaria.nome + " ---");
            System.out.println("1 - Cadastrar apartamentos");
            System.out.println("2 - Ajustar alugel dos apartamentos");
            System.out.println("3 - Mostrar media de quartos dos apartamentos");
            System.out.println("4 - MOstrar info da imobiliaria e dos apartamentos");
            System.out.println("5 - Sair do sistema");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    // Caso seja adicionado apartamentos
                    System.out.println("Endereço do apartamento: ");
                    String end = sc.nextLine();
                    System.out.println("Numero de quartos");
                    int quartos = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Area do apartamento: ");
                    double area = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Aluguel: ");
                    double aluguel = sc.nextDouble();
                    sc.nextLine();

                    // Criando um apartamento
                    Apartamento apto = new Apartamento(end,quartos,area,aluguel);

                    // Adicionando um apartamento na imobiliaria
                    imobiliaria.addApartamento(apto);
                    break;

                case 2:
                    imobiliaria.ajustaAluguel();
                    break;

                case 3:
                    System.out.println(imobiliaria.mediaArea());
                    break;

                case 4:
                    imobiliaria.mostraInfo();
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