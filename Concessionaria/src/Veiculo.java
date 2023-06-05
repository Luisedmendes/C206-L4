public class Veiculo implements Comparable<Veiculo>{
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double kmRodados;

    // Composicao
    Motor motor = new Motor();

    @Override
    public int compareTo(Veiculo veiculo) {
        return Integer.compare(this.ano, veiculo.ano); // Comparacao
    }

    // Métodos
    public void mostraInfos(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("kmRodados: "+this.kmRodados);
        System.out.println();
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
