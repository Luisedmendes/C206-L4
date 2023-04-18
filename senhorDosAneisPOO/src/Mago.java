public class Mago extends Habitante implements Cura, Feitico{
    // Atributos
    private String cor;

    public void atacar(){
        System.out.println("Mago atacando");
        super.atacar();

    }

    @Override
    public void mostraInfo(){
        System.out.println("A cor do mago é");
        super.mostraInfo();
    }

    @Override
    public void curar() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float) (energia+(energia*0.15)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O herói foi curado"); // Informando que o herói foi curado
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    @Override
    public void lancaFeitico() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float)(energia-(energia*0.1)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O mago lançou um feitiço!"); // Informando que o mago lançou feitico
        System.out.println("Sua energia atual: "+this.getEnergia());

    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
