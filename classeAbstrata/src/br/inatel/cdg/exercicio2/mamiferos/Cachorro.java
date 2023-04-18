package br.inatel.cdg.exercicio2.mamiferos;

public class Cachorro extends Mamifero {

    // Construtor
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    // Métodos
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}
