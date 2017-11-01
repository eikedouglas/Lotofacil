
package easyloto;

import java.util.ArrayList;

public class Jogo {
    
    private ArrayList<Integer> DezenasAposta = new ArrayList();
    private ArrayList<Integer> DezenasSorteadas = new ArrayList();
    private ArrayList<Integer> Acertos = new ArrayList();
    private int QntDezenas;
    private int QntAcertos;
    
    private int volante[][] = new int[5][5];
    
    
    public ArrayList<Integer> getDezenasAposta() {
        return DezenasAposta;
    }

    public void setDezenasAposta(ArrayList<Integer> DezenasAposta) {
        this.DezenasAposta = DezenasAposta;
    }
    
    public int getQntDezenas() {
        return QntDezenas;
    }

    public void setQntDezenas(int QntDezenas) {
        this.QntDezenas = QntDezenas;
    }
    
    public int[][] getVolante() {
        return volante;
    }
    
    public void setVolante() {
        int dezena = 1;
        for (int i = 0; i < 5; i++) {        
            for (int j = 0; j < 5; j++) {
                this.volante[i][j] = dezena;
                dezena++;
            }
        } 
    }

    public ArrayList<Integer> getDezenasSorteadas() {
        return DezenasSorteadas;
    }

    public void setDezenasSorteadas() {
        for (int i = 0; i < 15; i++) {        
            DezenasSorteadas.add(i+2);
        } 
    }
    
    public ArrayList<Integer> getAcertos() {
        return Acertos;
    }

    public void setAcertos(ArrayList<Integer> Acertos) {
        this.Acertos = Acertos;
    }
    public int getQntAcertos() {
        return QntAcertos;
    }

    public void setQntAcertos(int QntAcertos) {
        this.QntAcertos = QntAcertos;
    }
    
    //metodo que adiciona uma dezena na lista de dezenas da aposta
    public void adicionaDezena(int dez){
        DezenasAposta.add(dez);
        QntDezenas++;
    }
    
    //imprime a matriz do volante
    public void imprimeVolante(){
        for(int i = 0; i < volante.length; i++){
            for(int j = 0; j < volante.length; j++){
                    System.out.print(volante[i][j] + " ");
            }
            System.out.println();
        }	   
    }   
    //metodo calcula a quantidade e quais foram os acertos
    public void calculaAcertos(){
        for (int i = 0; i < DezenasAposta.size(); i++) {
            for (int j = 0; j < DezenasSorteadas.size(); j++) {
                if (DezenasAposta.get(i).equals(DezenasSorteadas.get(j))) {
                    Acertos.add(DezenasAposta.get(i));
                    QntAcertos++;
                } else {
                }
            }
        }
    }
    
    public void imprimeArray(ArrayList<Integer> Array){
        for (int i = 0; i < Array.size(); i++) {
            System.out.print(Array.get(i)+" ");
        }
        System.out.println("");
    }
 
}
