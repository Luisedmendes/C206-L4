public class Instagram extends RedeSocial{
    // Construtor
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Reescrita dos metodos
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no insta");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no insta");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no insta");
    }
}
