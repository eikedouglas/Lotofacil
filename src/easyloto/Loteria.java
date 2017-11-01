
package easyloto;

import java.util.ArrayList;

public class Loteria {
    
    private ArrayList<Integer> DezenasSorteadas = new ArrayList();
    private ArrayList<Jogo> ListaJogos = new ArrayList();
    
    public ArrayList<Integer> getDezenasSorteadas() {
        return DezenasSorteadas;
    }

    public void setDezenasSorteadas(ArrayList<Integer> DezenasSorteadas) {
        this.DezenasSorteadas = DezenasSorteadas;
    }

    public ArrayList<Jogo> getListaJogos() {
        return ListaJogos;
    }

    public void setListaJogos(ArrayList<Jogo> ListaJogos) {
        this.ListaJogos = ListaJogos;
    }
 
    //metodo calcula a quantidade e quais foram os acertos
    public void calculaAcertos(Jogo jogo){
        for (int i = 0; i < jogo.getDezenasAposta().size(); i++) {            
            for (int j = 0; j < DezenasSorteadas.size(); j++) {
                if (jogo.getDezenasAposta().get(i).equals(DezenasSorteadas.get(j))) {
                    jogo.getAcertos().add(jogo.getDezenasAposta().get(i));
                    jogo.getQntAcertos();
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
