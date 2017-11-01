
package easyloto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        Jogo j = new Jogo();
        j.setVolante();
        j.setDezenasSorteadas();
        j.imprimeVolante();
        j.imprimeArray(j.getDezenasSorteadas());
        System.out.println("Insira as dezenas");
        
        do {            
            j.adicionaDezena(s.nextInt());
        } while (j.getQntDezenas() < 15);
        j.calculaAcertos();
        
        System.out.println("Voce acertou: "+j.getQntAcertos()+" Dezenas");
        System.out.println("Acertos: "+j.getAcertos());
        //System.out.print(j.getQntDezenas());
    }
    
}
