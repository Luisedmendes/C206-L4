import java.util.ArrayList;

public class CarrinhoDeCompra {
    // Arraylist
    ArrayList<Biscoito> biscoitos = new ArrayList<>();

    // Agregação
    CupomDesconto cupomDesconto;

    // Métodos
    public void addBiscoito(Biscoito bisc) throws NumeroNegativoException{
        if(bisc.getQtd() <= 0){
            throw new NumeroNegativoException();
        } else {
            biscoitos.add(bisc);
        }
    }

    public double somaTotal(){
        double soma = 0;
        for (Biscoito biscoito : biscoitos) {
            soma += (biscoito.getValor()*biscoito.getQtd());
        }
        if (cupomDesconto.getValorDesconto() == 0){
            return soma;
        } else {
            return somaTotalComDesconto(soma,cupomDesconto.getValorDesconto());
        }

    }

    private double somaTotalComDesconto(double total, double desc){
        double valor;
        valor = total*(desc/100);
        return total-valor;
    }

}
