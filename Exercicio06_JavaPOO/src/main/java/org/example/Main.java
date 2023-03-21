package org.example;

public class Main {
    public static void main(String[] args) {

        // Instanciando classes
        // Criando banda
        Banda banda = new Banda("Slipknot","Metal");

        // Criando musicas
        Musica musica1 = new Musica("Duality",123f);
        Musica musica2 = new Musica("Before i forget",330f);

        // Criando membros
        Membro membro1 = new Membro("Corey Taylor","Vocalista");
        Membro membro2 = new Membro("Sid Wilson","Toca-discos");

        // Criando empresário
        Empresario empresario = new Empresario("Zeca drogadinho e só Lóló",122222445);
        banda.empresario = empresario;

        // Chamando metodo que adiciona novas musicas
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);

        // Chamando metodo que adiciona novos membros
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);

        // Chamando método de info
        banda.mostraInfo();


    }
}