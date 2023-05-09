public class Main {
    public static void main(String[] args) {
        // Instanciando carrinho de compras
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        // Instanciando biscoitos
        Biscoito bisc1 = new Biscoito();
        bisc1.setNome("Cookie");
        bisc1.setQtd(2);
        bisc1.setValor(3.50);
        bisc1.setSabor("Chocolate");

        Biscoito bisc2 = new Biscoito();
        bisc1.setNome("Cookie");
        bisc1.setQtd(1);
        bisc1.setValor(2.50);
        bisc1.setSabor("Aveia");

        try {
            carrinhoDeCompra.addBiscoito(bisc1);
            carrinhoDeCompra.addBiscoito(bisc2);
        } catch (Exception e){
            System.out.println("Impossível adicionar valores negativos ou nulos, favor rever a \n" +
                    "quantidade de biscoitos adicionados");
        }

        
    }
}