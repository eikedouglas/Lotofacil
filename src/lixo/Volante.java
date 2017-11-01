
package lixo;

public class Volante {
    
    private final int volante[][] = new int[5][5]; 
    static final int MinDez = 15;
    static final int MaxDez = 18;
    
    //construtor que alimenta a matriz volante com as 25 dezenas
    public Volante() {
        int dezena = 1;
        for (int i = 0; i < 5; i++) {        
            for (int j = 0; j < 5; j++) {
                this.volante[i][j] = dezena;
                dezena++;
            }
        }     
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
    
}
