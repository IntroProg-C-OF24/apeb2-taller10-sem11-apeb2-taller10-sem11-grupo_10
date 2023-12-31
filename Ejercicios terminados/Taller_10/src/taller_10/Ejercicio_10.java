/*
Con el objetivo de manipular correctamente los ciclos repetitivos anidados,
se solicita, dado la altura de la salida, generar por pantalla 
las siguientes figuras. Nota: Ud. Puede elegir libremente el carácter a mostrar.
Nota: Analice cual debería ser el límite correcto (mínimo y máximo) de la doble
img para que sea una doble pirámide legible, validar ese dato de entrada.
   *
  * *
 * * *
* * * *
 * * *
  * *
   *
Ejemplo dado un límite de 7.
 */
package taller_10;
public class Ejercicio_10 {
    public static void main(String[] args) {
        int limDatos = 4;
        for (int i = 0; i < limDatos; i++) {        
            for (int j = 0; j < limDatos - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
          for (int i = limDatos - 2; i >= 0; i--) {
            for (int j = 0; j < limDatos - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }      
    }
}
/*
   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 
*/
    

