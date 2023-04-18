public class Aviao extends Brinquedo{
    // Atributos
    int qtdMotores;

    // Métodos
    @Override
    public void mover(){
        System.out.println("Avião está voando");
    }

    @Override
    public void ligar(){
        System.out.println("Avião ligou");
    }

    @Override
    public void mostraInfos(){
        System.out.println(getModelo());
        System.out.println(getCor());
        System.out.println(qtdMotores);
    }

    public void setQtdMotores(int qtdMotores) {
        this.qtdMotores = qtdMotores;
    }
}
