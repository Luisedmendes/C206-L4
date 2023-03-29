package org.example;

public class Autor {
    // Atributos
    String nome;
    int anoNascimento;
    String profissao;

    public Autor(String nome, int anoNascimento, String profissao) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    // Métodos
    void mostrarInfos(){
        System.out.println("O nome do autor é: "+this.nome);
        System.out.println("O ano de nascimento do autor é: "+this.anoNascimento);
        System.out.println("A profissão do autor é: "+this.profissao);
    }
}
