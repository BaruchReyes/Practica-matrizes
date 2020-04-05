package en.x;

import java.util.Scanner;


public class EnX {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
          
          int r,y;
     System.out.println("Ingrese un numero impar: ");
    r=entrada.nextInt();
    System.out.println("Ingrese un numero de columnas impar: ");
    y=entrada.nextInt();

char matriz[][] = new char [r][y];

    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if (i==j || i+j==matriz.length-1){
                matriz[i][j] = '*';
            }
                else{
                        matriz[i][j] = ' ';
                        }
            
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
    
    

