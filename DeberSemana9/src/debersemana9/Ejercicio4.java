package debersemana9;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
         char[][] tablero = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char jugadorActual = 'X';

        while (true) {
            mostrarTablero(tablero);
            realizarMovimiento(tablero, jugadorActual);

            if (haGanado(tablero, jugadorActual)) {
                mostrarTablero(tablero);
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                break;
            }

            if (esEmpate(tablero)) {
                mostrarTablero(tablero);
                System.out.println("¡Empate!");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }

    private static void mostrarTablero(char[][] tablero) {
        System.out.println("\n--- Tablero ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    private static void realizarMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Jugador " + jugador + ", ingrese la fila (0-2): ");
            int fila = scanner.nextInt();
            System.out.print("Jugador " + jugador + ", ingrese la columna (0-2): ");
            int columna = scanner.nextInt();

            if (esMovimientoValido(tablero, fila, columna)) {
                tablero[fila][columna] = jugador;
                break;
            } else {
                System.out.println("Movimiento inválido. Inténtelo de nuevo.");
            }
        }
    }

    private static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    private static boolean haGanado(char[][] tablero, char jugador) {
      
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }

        return false;
    }

    private static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay al menos una casilla vacía
                }
            }
        }
        return true;
    }
}
