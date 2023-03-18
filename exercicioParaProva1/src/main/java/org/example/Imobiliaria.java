package org.example;

public class Imobiliaria {
    // Atributos
    String nome;
    String telefone;
    String cidade;

    // Array implicita
    Apartamento [] apartamentos = new Apartamento[30];

    // Construtor
    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    // Métodos
    void addApartamento(Apartamento apto){
        // Percorrendo o array de apartamentos
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i] == null){
                apartamentos[i] = apto;
                break;
            }
        }
    }

    // Método ajusta alugel
    void ajustaAluguel(){
        double varAux;// variavel auxilia
        for (int i = 0; i < apartamentos.length; i++) { // percorrendo apartamentos
            if(apartamentos[i]!= null){
               varAux = 0.05*(apartamentos[i].aluguel); // realizando conta do 5 porcento
               apartamentos[i].aluguel += varAux; // atualizando valor do apartamento
               break;
            }
        }
        System.out.println("Ajustado valor do aluguel");
    }

    int mediaArea(){
        double varAux = 0; // variavel auxiliar novamente
        double cont = 0; // contador para o numero de apartamentos
        for (int i = 0; i < apartamentos.length; i++) { // percorrendo apartamentos
            if (apartamentos[i] != null) {
                if (apartamentos[i].numQuartos <= 2) { // filtras apartamentos com 2 quartos ou menos
                    varAux += apartamentos[i].area;
                    cont++;
                }
            }
        }

        // Realizando casting
        double DoubleValue = (varAux/cont);
        int media = (int) DoubleValue;

        // retornando resultado da média
        return media;
    }

    void mostraInfo(){
        // Infos dos atributos básicos
        System.out.println("O nome da imbobiliaria é: "+this.nome);
        System.out.println("TEL: "+this.telefone);
        System.out.println("Cidade: "+this.cidade);
        System.out.println();

        // Infos do numero de apartamentos cadastrados
        for (int i = 0; i < apartamentos.length; i++) {
            if(apartamentos[i]!= null){
                apartamentos[i].mostraInfo();
            }

        }
    }

}
