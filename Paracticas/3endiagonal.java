
package ejemplo.mio.matriz;

import java.util.Scanner;


public class EjemploMioMatriz {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int numfilas,numcolumnas;
       
       System.out.print("INGRESE EL NUMERO DE FILAS");
       numfilas= entrada.nextInt();
       System.out.print("INGRESE EL NUMERO DE COLUMNAS");
       numcolumnas=entrada.nextInt();
       char Matriz [][] =new char [numfilas][numcolumnas];
       
       for (int i=0; i<numcolumnas;i++){
           
           for(int j=0; j<numfilas; j++){
               if (i+j<Matriz.length-1 || i+j>Matriz.length-1){
                   Matriz[i][j]= 'x';
                    }
              
               
              else{  Matriz [i][j] = ' '; 
              
           } 
           
           System.out.print(Matriz[i][j]+" ");
       } 
           System.out.println("");
    }
    
  }
}
    
