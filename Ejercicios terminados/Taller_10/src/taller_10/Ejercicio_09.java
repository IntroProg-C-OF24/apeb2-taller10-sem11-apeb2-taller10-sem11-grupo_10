/*
Con el objetivo de manipular correctamente los ciclos repetitivos anidados,
se solicita, dado la altura de la salida, generar por pantalla las siguientes
figuras. Nota: Ud. Puede elegir libremente el carácter a mostrar en la figura.
*
* *
* * *
* * * *
Ejemplo dado un límite de 4.
 */
package taller_10;
public class Ejercicio_09 {
    public static void main(String[] args) {
        int limDatos = 4;
        for (int i = 0; i < limDatos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*
*
**
***
****
*/