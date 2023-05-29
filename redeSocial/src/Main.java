import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // Scanner para leitura de dados
        int escolha; // int aux para o switch case
        boolean flag = true; // flag para estrutra do while

        while(flag){
            System.out.println("--------- BEM VINDO ---------");
            System.out.println("Escolha sua rede social: (AO MENOS DUAS REDES)");
            System.out.println("1 - Facebook");
            System.out.println("2 - Instagram");
            System.out.println("3 - Twitter");
            System.out.println("4 - GooglePlus");
            System.out.println("0 - Sair do programa");
            escolha = sc.nextInt();

            switch (escolha){
                case 0:
                    System.out.println("Fechando programa");
                    flag = false;

                case 1:
                    // Instanciando rede social
                    RedeSocial fb = new Facebook("aaab", 1000);
                    // Instanciando usuario
                    Usuario user1 = new Usuario(fb);
                    fb.curtirPublicacao();
                    break;

                case 2:
                    // Instanciando rede social
                    RedeSocial insta = new Instagram("aaac", 1000);
                    // Instanciando usuario
                    Usuario user2 = new Usuario(insta);
                    insta.postarVideo();
                    break;

                case 3:
                    // Instanciando rede social
                    RedeSocial tweet = new Twitter("aaad", 5020);
                    // Instanciando usuario
                    Usuario user3 = new Usuario(tweet);
                    tweet.postarComentario();
                    break;

                case 4:
                    // Instanciando rede social
                    RedeSocial gp =new GooglePlus("asdasd", 2100);
                    // Instanciando usario
                    Usuario user4 = new Usuario(gp);
                    gp.postarFoto();
                    break;
            }
        }
        sc.close();
    }
}