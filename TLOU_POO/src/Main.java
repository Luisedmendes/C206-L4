public class Main {
    public static void main(String[] args) {
        // Criando cidade
        Cidade cidade = new Cidade();

        // Criando um humano
        Humano humano1 = new Humano();
        humano1.setNome("Joel");
        humano1.setIdade(36);
        humano1.setVagalume(false);
        humano1.setDistanciaEscuta(50.05);
        humano1.setVida(50);
        humano1.setEnergia(20);

        // Criando um zumbi
        Zumbi zumbi1 = new Zumbi();
        zumbi1.setDiasInfeccao(250);
        zumbi1.setVida(60);

        // Criando uma arma
        Arma arma = new Arma();
        arma.setForca(5);
        arma.setTipoArma("Arma branca");

        // Chamando métodos do humano
        humano1.addArma(arma);
        humano1.modificarHabilidade(14,"Energia");

        // Adicionado na cidade
        cidade.adicionarPersonagens(humano1);
        cidade.adicionarPersonagens(zumbi1);

        // Modificando habilidade

        // Chamando método listar personagem
        cidade.listarPersonagens();


    }
}