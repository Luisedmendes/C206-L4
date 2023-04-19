public class Arma {
    // Atributos
    private int forca;
    private String tipoArma;

    // Métodos
    public void mostrarInfos(){
        System.out.println("-- INFORMAÇÕES DA ARMA --");
        System.out.println("Forca: "+this.forca);
        System.out.println("Tipo de arma: "+this.tipoArma);
    }

    // Getters e Setters
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
