package org.example;

public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    Carro(){
        this.motor = new Motor();
    }

    void ligar(){
        System.out.println("CARRO LIGADO");
    }

    void  acelerar(){
        System.out.println("CASSO ACELERANDO");
    }

    void mostrInfo(){
        System.out.println("COR: "+ cor);
        System.out.println("MARCA: "+ marca);
        System.out.println("MODELO: "+ modelo);
        System.out.println("VELOCIDADE MAXIMA: "+ velocidadeMax);
        System.out.println("VELOCIDADE ATUAL: "+ velocidadeAtual);
    }

}
