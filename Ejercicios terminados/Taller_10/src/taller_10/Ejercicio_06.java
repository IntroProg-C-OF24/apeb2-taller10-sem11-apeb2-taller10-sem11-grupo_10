/*
 Ejercicio 6
Desarrolla una solución en pseudocódigo que permita mediante un menú (al estilo calculadora matemática), 
facilitar las operaciones de suma, resta de dos matrices. Considere la validación de las reglas para 
realizar estas operaciones. Nota: Las matrices se deben llenar con número aleatorios únicos enteros 
positivos o negativos (-9-0, 0-9).
 */
package taller_10;
import java.util.Scanner;
public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int operar, entrar, limMatriz = 4;
        int mtrxA[][] = new int [limMatriz][limMatriz];
        int mtrxB[][] = new int [limMatriz][limMatriz];
        int sumaMat[][] = new int [limMatriz][limMatriz];
        System.out.println("Matrix A");
        for (int i = 0; i < mtrxA.length; i++) {
            for (int j = 0; j < mtrxA.length; j++) {
                mtrxA[i][j] = ((int)(Math.random()*(9-(-9)-1)+(-9)));
                System.out.print(mtrxA[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Matrix B");
        for (int i = 0; i < mtrxB.length; i++) {
            for (int j = 0; j < mtrxB.length; j++) {
                mtrxB[i][j] = ((int)(Math.random()*(9-(-9)-1)+(-9)));
                System.out.print(mtrxB[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Para empezar a operar aplaste: [1]");
        entrar = teclado.nextInt();
        while(entrar == 1){
            System.out.println("Para Sumar ponga:[1] para Restar: [2]");
            operar = teclado.nextInt();
            if(operar == 1){
                System.out.println("Suma de las Matrices");
                for (int i = 0; i < sumaMat.length; i++) {
                    for (int j = 0; j < sumaMat.length; j++) {
                        System.out.printf(mtrxA[i][j]+" + ("+mtrxB[i][j]+") = " + (mtrxA[i][j] + mtrxB[i][j]) + "\t \t");
                    }
                    System.out.println("");
                }
            }
            if(operar == 2){
                System.out.println("Resta de las Matrices");
                for (int i = 0; i < sumaMat.length; i++) {
                    for (int j = 0; j < sumaMat.length; j++) {
                        System.out.printf(mtrxA[i][j]+" - ("+mtrxB[i][j]+") = " + (mtrxA[i][j] - mtrxB[i][j]) + "\t \t");
                    }
                    System.out.println("");
                }
            }
            System.out.println("Desea volver a operar aplaste [1] si no aplaste [2]");
            entrar = teclado.nextInt();
        }       
    }
}
/*
Matrix A
0	-3	2	0	
2	3	-5	6	
-7	-6	-6	0	
3	4	3	0	
Matrix B
0	3	0	4	
-7	-5	7	-7	
-1	-8	3	-7	
-2	0	-4	-1	
Para empezar a operar aplaste: [1]
1
Para Sumar ponga:[1] para Restar: [2]
1
Suma de las Matrices
0 + (0) = 0	 	-3 + (3) = 0	 	2 + (0) = 2	 	0 + (4) = 4	 	
2 + (-7) = -5	 	3 + (-5) = -2	 	-5 + (7) = 2	 	6 + (-7) = -1	 	
-7 + (-1) = -8	 	-6 + (-8) = -14	 	-6 + (3) = -3	 	0 + (-7) = -7	 	
3 + (-2) = 1	 	4 + (0) = 4	 	3 + (-4) = -1	 	0 + (-1) = -1	 	
Desea volver a operar aplaste [1] si no aplaste [2]
1
Para Sumar ponga:[1] para Restar: [2]
2
Resta de las Matrices
0 - (0) = 0	 	-3 - (3) = -6	 	2 - (0) = 2	 	0 - (4) = -4	 	
2 - (-7) = 9	 	3 - (-5) = 8	 	-5 - (7) = -12	 	6 - (-7) = 13	 	
-7 - (-1) = -6	 	-6 - (-8) = 2	 	-6 - (3) = -9	 	0 - (-7) = 7	 	
3 - (-2) = 5	 	4 - (0) = 4	 	3 - (-4) = 7	 	0 - (-1) = 1	 	
Desea volver a operar aplaste [1] si no aplaste [2]
2
*/
