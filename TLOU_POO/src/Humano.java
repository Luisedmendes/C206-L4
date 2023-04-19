public class Humano extends Personagem implements Aprimorar, Lutar{
    // Atributos
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;

    // Agregação
    Arma arma;

    // Métodos
    @Override
    public void mostrarInfos(){
        super.mostrarInfos();
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Vagalume: "+this.vagalume);
        System.out.println("Energia: "+this.energia);
        System.out.println("distanciaEscuta: "+this.distanciaEscuta);
    }

    public void addArma(Arma arma){
        this.arma = arma; // A arma desta instancia receba uma nova arma
    }

    // Métodos da interface
    @Override
    public void modificarArma() {
        int varAux = arma.getForca(); // Var auxiliar para atualizar valor da forca
        this.arma.setForca(varAux+5); // Settando +5 na arma
        this.arma.mostrarInfos(); // Mostrando novas infos da arma
    }

    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade) {
        if (qtdPilulas <= 0){ // Caso numero inserido seja negativo ou zero
            System.out.println("Quantidade de pilulas invalidas, favor informar um valor maior que 0");
        } else {
            if (qtdPilulas >= 1 && qtdPilulas <= 10){ // De 0 a 10 pilulas
                if(tipoHabilidade.equalsIgnoreCase("Energia")){
                    energia = (double) (energia+(energia*0.02)); // Modificando energia atual
                    System.out.println("Energia modificada: "+this.energia);
                } else if(tipoHabilidade.equalsIgnoreCase("Escuta")){
                    distanciaEscuta = distanciaEscuta + 0.2; // Modificando distancia de escuta
                    System.out.println("Distancia de escuta modificada: "+this.energia);
                }
            } else if(qtdPilulas >10 && qtdPilulas <= 15){ // de 10 a 15 piluas
                if(tipoHabilidade.equalsIgnoreCase("Energia")){
                    energia = (double) (energia+(energia*0.04)); // Modificando energia atual
                    System.out.println("Energia modificada: "+this.energia);
                } else if(tipoHabilidade.equalsIgnoreCase("Escuta")){
                    distanciaEscuta = distanciaEscuta + 0.5; // Modificando distancia de escuta
                    System.out.println("Energia modificada: "+this.energia);
                }
            }
        }

    }

    @Override
    public void atacar() {
        System.out.println(this.nome+ " esta atacando com a arma: ");
        this.arma.mostrarInfos();
    }

    @Override
    public void defender() {
        System.out.println(this.nome+ " esta se defendendo com a arma: ");
        this.arma.mostrarInfos();
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }
}
