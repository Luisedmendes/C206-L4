public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    // Construtor
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Reescrita dos metodos
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no faceboook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no facebook");
    }

    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou publicação no facebook");
    }
}
