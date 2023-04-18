package br.inatel.cdg.exercicio2.mamiferos;

import br.inatel.cdg.exercicio2.interfaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    // Construtor
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    // Métodos
    @Override
    public void emitirSom() {
        System.out.println("Emitindo um som");
    }

    @Override
    public void nadar(){
        System.out.println("Nadando");
    }
}
