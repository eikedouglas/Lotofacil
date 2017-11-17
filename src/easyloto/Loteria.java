
package easyloto;

import java.util.ArrayList;

public class Loteria {
    
    private ArrayList<Integer> DezenasSorteadas = new ArrayList();
    private ArrayList<Jogo> ListaJogos = new ArrayList();
    private ArrayList<Jogo> JogosPremiados = new ArrayList();  
    private int qnt_15;
    private int qnt_16;
    private int qnt_17;
    private int qnt_18;

    public ArrayList<Jogo> getJogosPremiados() {
        return JogosPremiados;
    }

    public void setJogosPremiados(ArrayList<Jogo> JogosPremiados) {
        this.JogosPremiados = JogosPremiados;
    }

    public int getQnt_15() {
        return qnt_15;
    }

    public void setQnt_15(int valor) {
        this.qnt_15 = this.qnt_15 + valor;
    }

    public int getQnt_16() {
        return qnt_16;
    }

    public void setQnt_16(int valor) {
        this.qnt_16 = this.qnt_16 + valor;
    }

    public int getQnt_17() {
        return qnt_17;
    }

    public void setQnt_17(int valor) {
        this.qnt_17 = this.qnt_17 + valor;
    }

    public int getQnt_18() {
        return qnt_18;
    }

    public void setQnt_18(int valor) {
        this.qnt_18 = this.qnt_18 + valor;
    }
    
    public ArrayList<Integer> getDezenasSorteadas() {
        return DezenasSorteadas;
    }

    public void setDezenasSorteadas(ArrayList<Integer> DezenasSorteadas) {
        this.DezenasSorteadas = DezenasSorteadas;
        
        //for (int i = 0; i < 15; i++) {
            //DezenasSorteadas.add(i+1);
        //}
    }

    public ArrayList<Jogo> getListaJogos() {
        return ListaJogos;
    }

    public void setListaJogos(ArrayList<Jogo> ListaJogos) {
        this.ListaJogos = ListaJogos;
    }
 
    //metodo calcula a quantidade e quais foram os acertos
    public void calculaAcertosJogo(Jogo jogo){
        for (int i = 0; i < jogo.getDezenasAposta().size(); i++) { 
            for (int j = 0; j < DezenasSorteadas.size(); j++) {
                if (jogo.getDezenasAposta().get(i).equals(DezenasSorteadas.get(j))) {
                    jogo.getAcertos().add(jogo.getDezenasAposta().get(i));
                    jogo.setQntAcertos(1);
                } 
            }
        }
    }
    
    public void imprimeArray(ArrayList<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+" ");
        }
        System.out.println("");
    }
  
    public void varreListaJogos(ArrayList<Jogo> lista){
        for (int i = 0; i < lista.size(); i++) {                                   
            Jogo jogo = lista.get(i);
            calculaAcertosJogo(jogo);
            
            if (jogo.getQntAcertos() == 15) {
                JogosPremiados.add(jogo);
                System.out.println("Jogo ID: "+jogo.getIdJogo()+" Premiado com "+jogo.getQntAcertos()+" acertos");                
            }    
        }
        System.out.println("Quantidade de Jogos Premiados: "+ JogosPremiados.size());
    }
    
}
