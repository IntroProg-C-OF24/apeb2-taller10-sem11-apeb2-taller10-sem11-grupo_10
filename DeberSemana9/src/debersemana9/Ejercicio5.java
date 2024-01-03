package debersemana9;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la primera matriz: ");
        int filasA = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz: ");
        int columnasA = scanner.nextInt();

        System.out.print("Ingrese el número de filas de la segunda matriz: ");
        int filasB = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnasB = scanner.nextInt();

        if (columnasA != filasB) {
            System.out.println("La multiplicación de matrices no es posible con las dimensiones dadas.");
            return;
        }

        int[][] matrizA = generarMatrizAleatoria(filasA, columnasA);
        int[][] matrizB = generarMatrizAleatoria(filasB, columnasB);

        System.out.println("\nMatriz A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMatriz B:");
        mostrarMatriz(matrizB);

        int[][] resultado = multiplicarMatrices(matrizA, matrizB);

        System.out.println("\nResultado de la multiplicación:");
        mostrarMatriz(resultado);
    }

    private static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(19) - 9; // Números aleatorios entre -9 y 9
            }
        }

        return matriz;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }
}
