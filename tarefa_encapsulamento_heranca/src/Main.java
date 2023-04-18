public class Main {
    public static void main(String[] args) {
        // Instanciando
        Brinquedo carrinho = new Carrinho();
        carrinho.setModelo("Camionete");
        carrinho.setCor("Azul");

        Aviao aviao = new Aviao();
        aviao.setModelo("Boeing");
        aviao.setCor("Branco");
        aviao.setQtdMotores(3);

        Brinquedo barco = new Barco();
        barco.setModelo("Lancha");
        barco.setCor("Preta");

        ColecaoBrinquedos toylist = new ColecaoBrinquedos();

        toylist.adicionarBrinquedos(carrinho);
        toylist.adicionarBrinquedos(aviao);
        toylist.adicionarBrinquedos(barco);

        toylist.listarBrinquedos();

        System.out.println(barco.getQtdBrinquedos());


    }
}