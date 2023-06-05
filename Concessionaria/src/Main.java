import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando um arquivo
        Arquivo arq = new Arquivo();

        // Criando veiculo
        Veiculo veiculo = new Veiculo();

        // Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Flag de controle

        boolean flag = true;

        while (flag){
            ArrayList<Veiculo> veiculos = arq.ler();

            System.out.println("BEM VINDO AO MENU");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Listar veiculos");
            System.out.println("3 - Ordenar veiculos em ordem decrescente com base no ano");
            System.out.println("4 - Quantos veiculos tem cada marca em estoque");
            System.out.println("5 - Sair");
            System.out.println("Entre com a sua opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println(" ADICIONANDO UM VEICULO");

                    try {
                        System.out.println("Marca: ");
                        veiculo.setMarca(sc.nextLine());
                        // Verificando texto digitado
                        if(!(veiculo.getMarca().equalsIgnoreCase("Bentley")
                        || veiculo.getMarca().equalsIgnoreCase("Rolls-Royce"))){
                            throw new ValorInvalidoException("Marca invalida");
                        }

                        System.out.println("Modelo: ");
                        veiculo.setModelo(sc.nextLine());

                        System.out.println("Ano: ");
                        veiculo.setAno(sc.nextInt());
                        if(veiculo.getAno() < 1960 || veiculo.getAno() > 2024 ){
                            throw new ValorInvalidoException("Ano invalido");
                        }

                        System.out.println("Km rodados: ");
                        veiculo.setKmRodados(sc.nextDouble());
                        if(veiculo.getKmRodados() < 0){
                            throw new ValorInvalidoException("Km rodados invalido");
                        }

                        System.out.println("Potencia do motor: ");
                        veiculo.motor.setPotencia(sc.nextDouble());
                        if(veiculo.motor.getPotencia() < 0 || veiculo.motor.getPotencia() == 0){
                            throw new ValorInvalidoException("Potencia invalida");
                        }

                        System.out.println("Numero de cilindros: ");
                        veiculo.motor.setNumCilindros(sc.nextInt());
                        if(veiculo.motor.getNumCilindros() < 0 || veiculo.motor.getNumCilindros() == 0){
                            throw new ValorInvalidoException("Numero de cilindros invalido");
                        }
                    } catch (ValorInvalidoException valor){
                        System.out.println(valor);
                        break;
                    }

                    arq.escrever(veiculo); // Salvando veiculo no arquivo
                    break;

                case 2:
                    // Percorrendo o arraylist de veiculos
                    for (int i = 0; i < veiculos.size(); i++) {
                        veiculos.get(i).mostraInfos();
                    }
                    break;

                case 3:
                    Collections.sort(veiculos); // Ordenando veiculos
                    Collections.reverse(veiculos); // Revertendo
                    // Mostrando veiculos
                    for (int i = 0; i < veiculos.size(); i++) {
                        veiculos.get(i).mostraInfos();
                    }
                    break;

                case 4:
                    int varAuxRolls = 0;
                    int varAuxBen = 0;
                    // Percorrendo veiculos
                    for (int i = 0; i < veiculos.size(); i++) {
                        if(veiculos.get(i).getMarca().equals("Rolls-Royce")){
                            varAuxRolls++;
                        } else {
                            varAuxBen++;
                        }
                    }
                    // Mostrando a quantidade
                    System.out.println("Veiculos Rolls-Royce presentes no estoque: "+varAuxRolls);
                    System.out.println("Veiculos Bentley presentes no estoque: "+varAuxBen);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("OPCAO INVALIDA!!");
                    break;
            }
        }

    }
}