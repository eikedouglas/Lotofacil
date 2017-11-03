
package easyloto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        int i = 0;
        
        Loteria loteria = new Loteria();
        loteria.setDezenasSorteadas();
        loteria.imprimeArray(loteria.getDezenasSorteadas());
        
        do { 
            Jogo j = new Jogo();
            j.setIdJogo(i);
            
            System.out.println("ID do Jogo :"+j.getIdJogo());
            System.out.println("Insira as dezenas");
            do {            
            j.adicionaDezena(s.nextInt());
            } while (j.getQntDezenas() < 15);
            loteria.getListaJogos().add(j);
            
            i++;
        } while (i < 3);

        loteria.varreListaJogos(loteria.getListaJogos());

//        j.setVolante();
//        j.setDezenasSorteadas();
//        j.imprimeVolante();
//        j.imprimeArray(j.getDezenasSorteadas());
//        System.out.println("Insira as dezenas");
//        
//        do {            
//            j.adicionaDezena(s.nextInt());
//        } while (j.getQntDezenas() < 15);
//        j.calculaAcertos();
//        
//        System.out.println("Voce acertou: "+j.getQntAcertos()+" Dezenas");
//        System.out.println("Acertos: "+j.getAcertos());
//        //System.out.print(j.getQntDezenas());
    }
    
}
