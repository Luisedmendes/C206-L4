package org.example;

public class Apartamento {
    // Atributos
    String endereço;
    int numQuartos;
    double area;
    double aluguel;

    // Construtor
    public Apartamento(String endereço, int numQuartos, double area, double aluguel) {
        this.endereço = endereço;
        this.numQuartos = numQuartos;
        this.area = area;
        this.aluguel = aluguel;
    }

    // Métodos
    void mostraInfo(){
        System.out.println(endereço);
        System.out.println(numQuartos);
        System.out.println(area);
        System.out.println(aluguel);
    }

}
