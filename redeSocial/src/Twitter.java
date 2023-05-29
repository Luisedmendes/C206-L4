public class Twitter extends RedeSocial implements Compartilhamento{
    // Construtor
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Reescrita dos metodos
    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou uma publicacao no twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no twitter");
    }
}
