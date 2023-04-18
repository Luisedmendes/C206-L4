public class Elfo extends Habitante implements Cura{
    // Atributos
    private String tribo;

    // Métodos
    public void viajar(){
        System.out.println("Elfo viajando");
    }

    public void atacar(){
        System.out.println("Enfo atacou");
        super.atacar();

    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(tribo);
    }

    @Override
    public void curar() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float) (energia+(energia*0.15)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O herói foi curado"); // Informando que o herói foi curado
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    // Setters
    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
