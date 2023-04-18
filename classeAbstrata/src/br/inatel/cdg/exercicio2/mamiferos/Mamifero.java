package br.inatel.cdg.exercicio2.mamiferos;

public abstract class Mamifero {
    // Atributos
    protected String nome;
    protected double vida;

    // Construtor
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Métodos
    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println(nome);
        System.out.println(vida);
    }



}
