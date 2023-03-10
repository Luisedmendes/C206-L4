package org.example;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int x = entrada.nextInt();
        int y = entrada.nextInt();

        System.out.println("Escolha a operação (1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão e 5 para exponencial ");
        int escolha = entrada.nextInt();

        if (escolha == 1){
            System.out.println("A soma é "+(y+x));
        } else if (escolha == 2) {
            System.out.println("A subtração é "+(x-y));
        } else if (escolha == 3) {
            System.out.println("A multiplicação é "+(x*y));
        } else if (escolha == 4){
            System.out.println("A divisão é "+(x/y));
        } else {
            System.out.println("A exponencial é "+(Math.pow(x,y)));
        }

    }
}