public abstract class RedeSocial {
    // Atributos
    protected String senha;
    protected int numAmigos;

    // Construtor
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    // Métodos abstratos
    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    // Metodo nao abstrato
    public void curtirPublicacao(){
        System.out.println("Publicacao recebeu curtida");
    }

}
