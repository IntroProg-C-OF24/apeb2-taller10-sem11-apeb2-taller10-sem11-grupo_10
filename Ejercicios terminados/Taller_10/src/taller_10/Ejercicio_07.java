/*
Ejercicio 7
Dada una matriz cuadrada y con número aleatorios únicos enteros positivos
o negativos (-9-0, 0-9) generados automáticamente, presenta los elementos
de la diagonal secundaria, los ubicados sobre la diagonal secundaria,
y bajo dicha diagonal.
 */
package taller_10;

public class Ejercicio_07 {
    public static void main(String[] args) {
        int limMatr = 3;
        int mtrx[][] = new int[limMatr][limMatr];
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) {
                mtrx[i][j] = ((int)(Math.random()*(9-(-9)-1)+(-9)));  
                System.out.print(mtrx[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) {
                if(i + j == limMatr-1)
                    System.out.print(mtrx[i][j]+"\t");
            }
        }
        System.out.println("");
        System.out.println("Sobre");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) {
                if(i + j < limMatr-1)
                    System.out.print(mtrx[i][j]+"\t");
            }
        }
        System.out.println("");
        System.out.println("Debajo");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) {
                if(i + j > limMatr-1)
                    System.out.print(mtrx[i][j]+"\t");
            }
        }
        System.out.println("");
    }   
}
/*
7	-7	-6	 
-2	1	-3	 
-8	-6	-5	

Diagonal Secundaria
-6	1	-8	

Sobre
7	-7	-2	

Debajo
-3	-6	-5	
*/
