public class ColecaoBrinquedos {

    // Array de brinquedoos
    private Brinquedo [] brinquedos = new Brinquedo[120];

    // Métodos
    public void adicionarBrinquedos(Brinquedo brinquedo){
        for (int i = 0; i < brinquedos.length; i++) {
            if(brinquedos[i] == null){
                brinquedos[i] = brinquedo;
                break;
            }
        }
    }

    public void listarBrinquedos(){
        int contBrinquedo = 0;
        for (int i = 0; i < brinquedos.length; i++) {
            if(brinquedos[i] != null){
                brinquedos[i].mostraInfos();
                brinquedos[i].ligar();
                brinquedos[i].mover();
                contBrinquedo++;
            }
        }
        brinquedos[0].setQtdBrinquedos(contBrinquedo);
    }
}
