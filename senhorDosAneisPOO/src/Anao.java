public class Anao extends Habitante implements Mineracao{
    // Atributos
    private float altura;
    private String reino;

    // Métodos
    public void atacar(){
        System.out.println("Anao atacou");
        super.atacar();
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(this.altura);
        System.out.println(this.reino);
    }

    @Override
    public void minerar() {
        System.out.println("Anao minerando");
    }

    // Setters
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
