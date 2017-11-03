
package easyloto;

import java.util.ArrayList;

public class Jogo {
    
    private int idJogo;
    private ArrayList<Integer> DezenasAposta = new ArrayList();
    private ArrayList<Integer> Acertos = new ArrayList();
    private int QntDezenas = 0;
    private int QntAcertos = 0;
    
    public ArrayList<Integer> getDezenasAposta() {
        return DezenasAposta;
    }

    public void setDezenasAposta(ArrayList<Integer> DezenasAposta) {
        this.DezenasAposta = DezenasAposta;
    }
    
    public ArrayList<Integer> getAcertos() {
        return Acertos;
    }

    public void setAcertos(ArrayList<Integer> Acertos) {
        this.Acertos = Acertos;
    }
    
    public int getQntDezenas() {
        return QntDezenas;
    }

    public void setQntDezenas(int QntDezenas) {
        this.QntDezenas = QntDezenas;
    }
    
    public int getQntAcertos() {
        return QntAcertos;
    }

    public void setQntAcertos(int Valor) {
        this.QntAcertos = this.QntAcertos + Valor;
    }
    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }
    
    //metodo que adiciona uma dezena na lista de dezenas da aposta
    public void adicionaDezena(int dez){
        DezenasAposta.add(dez);
        QntDezenas++;
    }

    //private int volante[][] = new int[5][5];   
//    public int[][] getVolante() {
//        return volante;
//    }
//    
//    public void setVolante() {
//        int dezena = 1;
//        for (int i = 0; i < 5; i++) {        
//            for (int j = 0; j < 5; j++) {
//                this.volante[i][j] = dezena;
//                dezena++;
//            }
//        } 
//    }
    
    //imprime a matriz do volante
//    public void imprimeVolante(){
//        for(int i = 0; i < volante.length; i++){
//            for(int j = 0; j < volante.length; j++){
//                    System.out.print(volante[i][j] + " ");
//            }
//            System.out.println();
//        }	   
//    }   

}
