public class Cidade {
    // Atributos
    private String nome;

    // Array implicita
    private Personagem[] personagens = new Personagem[10];

    // Métodos
    public void adicionarPersonagens(Personagem p){
        for (int i = 0; i < personagens.length; i++) {
            // Conferir se a posicao esta vazia
            if(personagens[i] == null){
                personagens[i] = p;
                break;
            }
        }
    }

    public void listarPersonagens(){
        // For para percorrer todos habitantes
        for (int i = 0; i < personagens.length; i++) {
            // Vericando se nn é vazio
            if(personagens[i] != null){
                // Verificar se é um zumbi ou humano
                if(personagens[i] instanceof Humano){
                    // Realizando casting
                    Humano auxHumano = (Humano) personagens[i];
                    auxHumano.mostrarInfos();
                    auxHumano.atacar();
                    auxHumano.defender();
                    auxHumano.modificarArma();
                } else {
                    // Realizando casting
                    Zumbi auxZumbi = (Zumbi) personagens[i];
                    auxZumbi.transformacao();
                    auxZumbi.atacar();
                    auxZumbi.defender();
                    auxZumbi.infectou();
                    auxZumbi.mostrarInfos();
                }
            }
        }
    }
}
