public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento{
    // Construtor
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    // Reescrita dos métodos
    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou uma publicacao no google plus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no google plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no google plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no google plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no google plus");
    }
}
