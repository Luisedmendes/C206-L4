public class Barco extends Brinquedo{
    // Métodos
    @Override
    public void mover(){
        System.out.println("Barco esta navegando");
    }

    @Override
    public void ligar(){
        System.out.println("Barco está ligado");
    }

    @Override
    public void mostraInfos(){
        System.out.println(getModelo());
        System.out.println(getCor());
    }
}
