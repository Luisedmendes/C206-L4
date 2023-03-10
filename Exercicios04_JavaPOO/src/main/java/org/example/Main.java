package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Atribuindo as caracteristicas de cada carro
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r?\n");

        System.out.println("Insira modelo, marca, cor, velocidade maxima e velocidade atual do carro 1");
        carro1.modelo = sc.next();
        carro1.marca = sc.next();
        carro1.cor = sc.next();
        carro1.velocidadeMax = sc.nextDouble();
        carro1.velocidadeAtual = sc.nextDouble();

        System.out.println("Insira modelo, marca, cor, velocidade maxima e velocidade atual do carro 1");
        carro2.modelo = sc.next();
        carro2.marca = sc.next();
        carro2.cor = sc.next();
        carro2.velocidadeMax = sc.nextDouble();
        carro2.velocidadeAtual = sc.nextDouble();

        System.out.println("INSIRA A POTENCIA E O TIPO DE CADA MOTOR RESPECTIVAMENTE: ");
        carro1.motor.potencia = sc.nextInt();
        carro1.motor.tipo = sc.next();
        carro2.motor.potencia = sc.nextInt();
        carro2.motor.tipo = sc.next();

        sc.close();

        //Chamando os métodos

        carro1.ligar();
        carro1.acelerar();
        carro1.mostrInfo();
        carro1.motor.mostraInfo();
        System.out.println();
        carro2.ligar();
        carro2.acelerar();
        carro2.mostrInfo();
        carro2.motor.mostraInfo();




    }
}