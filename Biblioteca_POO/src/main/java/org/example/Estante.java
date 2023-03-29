package org.example;

public class Estante {
    // Atributos
    int idEstante;
    char letra;

    // Contrutor
    public Estante(int idEstante, char letra) {
        this.idEstante = idEstante;
        this.letra = letra;
    }

    // Array implicita
    Livro [] livros = new Livro[160];


    // Métodos
    void addLivros(Livro livro){
        // Percorrendo array de livros
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }
    }

    void porcentagemGen(){
        // Declarando variaveis auxiliares de contagem de cada genero
        double contDrama = 0;
        double contSuspense = 0;
        double contOutros = 0;
        double totalLivros = 0;

        double porcentagemDrama = 0;
        double porcentagemSuspense = 0;
        double porcentagemOutros = 0;

        // Percorrendo array de livros
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                totalLivros++;
                // Lógica para contar quantos livros há de cada genero
                if(livros[i].genLiterario.equalsIgnoreCase("drama")){
                    contDrama++;
                } else if (livros[i].genLiterario.equalsIgnoreCase("suspense")){
                    contSuspense++;
                } else {
                    contOutros++;
                }
            }
        }

        // Lógica caso tente realzar alguma operação sem livro
        if(totalLivros == 0){
            System.out.println("NÃO NENHUM LIVRO CADASTRADO AINDA");

        } else {
            // Lógica para descobrir porcentagem de cada livro
            porcentagemSuspense = (contSuspense/totalLivros)*100;

            porcentagemDrama = (contDrama/totalLivros)*100;

            porcentagemOutros = (contOutros/totalLivros)*100;

            // Mostrando porcentagens
            System.out.println("As porcentagem de cada gênero foram as seguintes: ");
            System.out.println("Suspense: "+porcentagemSuspense+"%");
            System.out.println("Drama: "+porcentagemDrama+"%");
            System.out.println("Outros: "+porcentagemOutros+"%");
        }

    }

    void livroMaisEMenosPag(){
        // Variaveis auxiliares
        int livroMais = 0;
        int livroMenos = 9999999;
        int isalvaMaior = 0;
        int isalvaMenor = 0;

        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                if (livros[i].qtdFolhas > livroMais) {
                    livroMais = livros[i].qtdFolhas;
                    isalvaMaior = i;
                }
                if (livros[i].qtdFolhas < livroMenos) {
                    livroMenos = livros[i].qtdFolhas;
                    isalvaMenor = i;
                }
            }
        }

        if(livroMais == 0){
            System.out.println("NÃO NENHUM LIVRO CADASTRADO AINDA");
        } else {
            // Apresentando menorLivro maiorLivro
            System.out.println("O livro com mais paginas é:");
            livros[isalvaMaior].mostrarInfos();
            System.out.println();
            System.out.println("O livro com menos paginas é: ");
            livros[isalvaMenor].mostrarInfos();
        }

    }


    void mostrarInfos(){
        System.out.println("O id da estante é: "+this.idEstante);
        System.out.println("A letra da estante é: "+this.letra);
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                System.out.println("Titulo, gênero, quantidade de folhas e editora: ");
                System.out.println(livros[i].titulo+" "+livros[i].genLiterario+" "+livros[i].qtdFolhas+" "+livros[i].editora);
                System.out.println();
            }
        }

    }

}
