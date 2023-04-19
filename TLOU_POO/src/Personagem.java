public abstract class Personagem {
    // Atributos
    private static int numPersonagens = 0; // Começando com zero
    private int vida;
    private int idPersonagem;

    // Construtor da classe Personagem
    Personagem(){
        this.numPersonagens++;
        this.idPersonagem = numPersonagens;
    }

    // Métodos
    public void mostrarInfos(){
        System.out.println("-- DADOS DO PERSONAGEM --");
        System.out.println("Vida"+this.vida);
        System.out.println("id: "+this.idPersonagem);
    }

    // Setters e Getters
    public void setVida(int vida) {
        this.vida = vida;
    }

    public static int getNumPersonagens() {
        return numPersonagens;
    }
}
