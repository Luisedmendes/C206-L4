package org.example;

public class Banda {
    // Atributos
    String nome;
    String genero;

    // Agregações
    Membro membros [] = new Membro[6];
    Musica musicas [] = new Musica[30];
    Empresario empresario;

    // Construtor
    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Métodos
    void addMusicaNova(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }

    }

    void addMembroNovo(Membro membro){
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("O nome da banda é: "+ this.nome+" e seu gênero é "+this.genero);
        System.out.println("Seus membros se chamam e tem como funcao: ");
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null){
                System.out.println(membros[i].nome + " "+membros[i].funcao);
            }
        }

        System.out.println("Seus musicas são: ");
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null){
                System.out.println(musicas[i].nome +" " + musicas[i].duracao);
            }
        }
        System.out.println("O empresário se chama "+ empresario.nome + " e seu cnpj é "+empresario.cnpj);
    }

}
