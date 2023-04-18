public class Brinquedo {
    // Atributos
    private String modelo;
    private String cor;
    private static int qtdBrinquedos = 0;

    // Métodos
    public void mover(){
        System.out.println("Movendo");
    }

    public void ligar(){
        System.out.println("Ligando");
    }

    public void mostraInfos(){
        System.out.println("Mostrando infos");
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public static int getQtdBrinquedos() {
        return qtdBrinquedos;
    }

    /// Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void setQtdBrinquedos(int qtdBrinquedos) {
        Brinquedo.qtdBrinquedos = qtdBrinquedos;
    }
}
