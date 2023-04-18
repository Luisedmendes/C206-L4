public class Carrinho extends Brinquedo{
    @Override
    public void mover(){
        System.out.println("Carrinho mexendo");
    }

    @Override
    public void ligar(){
        System.out.println("Carrinho ligou");
    }

    @Override
    public void mostraInfos(){
        System.out.println(getModelo());
        System.out.println(getCor());
    }


}
