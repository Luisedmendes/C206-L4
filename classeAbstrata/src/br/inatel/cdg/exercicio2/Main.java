package br.inatel.cdg.exercicio2;

import br.inatel.cdg.exercicio2.mamiferos.Cachorro;
import br.inatel.cdg.exercicio2.mamiferos.Lontra;
import br.inatel.cdg.exercicio2.mamiferos.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro = new Cachorro("Duque",12);
        Lontra lontra = new Lontra("clovis",50);

        cachorro.emitirSom();
        lontra.emitirSom();
        lontra.nadar();

        cachorro.mostraInfo();
        lontra.mostraInfo();
    }
}