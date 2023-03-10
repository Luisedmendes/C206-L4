package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com as notas NP1 e NP2");
        float Np1 = entrada.nextFloat();
        float Np2 = entrada.nextFloat();

        float media =  (Np1+Np2)/2;

        System.out.println("A média final foi: "+Math.round(media));
    }
}
