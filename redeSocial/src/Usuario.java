public class Usuario {
    // Atributos
    private String nome = "Batata";
    private String email = "batata@live.com";

    // Array implicito
    RedeSocial[] redes = new RedeSocial[10];

    // Construtor
    public Usuario(RedeSocial redesSociais) {
        for (int i = 0; i < redes.length; i++) {
            if(redes[i] == null){
                redes[i] = redesSociais;
                break;
            }
        }
    }
}
