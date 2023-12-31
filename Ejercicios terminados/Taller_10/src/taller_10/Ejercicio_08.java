/*
Ejercicio 8
Dada una matriz cuadrada y con número aleatorios únicos enteros
positivos o negativos (-9-0, 0-9) generados automáticamente,
presenta los elementos de la diagonal principal, los ubicados 
sobre la diagonal principal, y bajo dicha principal.
 */
package taller_10;
public class Ejercicio_08 {
    public static void main(String[] args) {
        int limMatr = 5;
        int mtrx[][] = new int[limMatr][limMatr];
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) {
                mtrx[i][j] = ((int)(Math.random()*(9-(-9)-1)+(-9)));  
                System.out.print(mtrx[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("=== Diagonal === \n");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) { 
                if(i==j)
                System.out.print(mtrx[i][j]+"\t");
            }
        }
        System.out.println("");
        System.out.println("=== Sobre ===");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx.length; j++) { 
                if(i<j)
                System.out.print(mtrx[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("=== Debajo ===");
        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < i; j++) { 
                System.out.print(mtrx[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
/*
4	0	1	0	0	 
0	-5	-6	-8	6	 
0	-1	2	-6	-3	 
-3	-3	7	-5	-4	 
4	-7	-1	1	3	 
=== Diagonal === 

4	-5	2	-5	3	
=== Sobre ===
0	1	0	0	 
-6	-8	6	 
-6	-3	 
-4	 
 
=== Debajo ===
 
0	 
0	-1	 
-3	-3	7	 
4	-7	-1	1	 
*/