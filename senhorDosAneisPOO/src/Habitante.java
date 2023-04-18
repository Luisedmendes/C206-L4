public abstract class Habitante {
    // Atributos
    public static int contador = 0;
    protected int id;
    protected  String nome;
    protected int idade;
    protected float energia;

    Habitante(){
        this.contador++;
        this.id = contador;
    }

    // Agregação
    Arma arma;

    // Métodos
    public void atacar(){
        System.out.println("Informações da arma: ");
        System.out.println("Nome: "+arma.getNomeArma());
        System.out.println("Magica: "+arma.getMagica());

        if(arma.getMagica()){
            this.energia = this.energia-20;
            System.out.println(this.nome+" Atacou com arma magica");
            System.out.println("Energia apos ataque: "+this.energia);
        } else {
            this.energia = this.energia-10;
            System.out.println(this.nome+" Atacou com arma normal");
            System.out.println("Energia apos ataque: "+this.energia);
        }
    }

    public void mostraInfo(){
        System.out.println(id);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(energia);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
}
