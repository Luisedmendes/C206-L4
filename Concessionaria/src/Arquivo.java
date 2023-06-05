import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Método que serve para escrever no Arquivo
    public void escrever(Veiculo veiculo){
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;


        try{
            // Abrindo a saída de dados
            os=new FileOutputStream("veiculos.txt",true); // Nome do arquivo onde será salvo
            osw=new OutputStreamWriter(os);
            bw= new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ VEICULOS ++\n");
            bw.write(veiculo.getMarca()+"\n");
            bw.write(veiculo.getModelo()+"\n");
            bw.write(veiculo.getAno()+"\n");
            bw.write(veiculo.getKmRodados()+"\n");

        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Veiculo> ler(){
        ArrayList<Veiculo> veiculosEncontrados = new ArrayList<>();
        // Classes que permitem leitura de dados do arquivo
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try{
            // Instanciando os objetos
            is=new FileInputStream("veiculos.txt");
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer=br.readLine();

            while(linhaLer!=null){
                // Comparando se o que está em linhaLer é igual a minha flag
                if(linhaLer.contains("++ VEICULOS ++")){
                    // Variável auxiliar de filme
                    Veiculo veiculoAux=new Veiculo();

                    // Criando um objeto do tipo livro com as variáveis auxiliares
                    veiculoAux.setMarca(br.readLine());
                    veiculoAux.setModelo(br.readLine());
                    veiculoAux.setAno(Integer.parseInt(br.readLine()));
                    // Para a quantidade de páginas é necessária fazer a conversão de String para Int
                    veiculoAux.setKmRodados(Double.parseDouble(br.readLine())); // Conversão

                    // Adicionando o livro no array de livros
                    veiculosEncontrados.add(veiculoAux);
                }
                linhaLer=br.readLine();
            }


        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return veiculosEncontrados;
    }
}