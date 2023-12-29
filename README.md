# Taller 10 (Laboratorio-GRUPAL)

## Construcción de programas usando arreglos bidimensionales

* Definir la mejor estrategia de trabajo en grupo, ya que Ud. deberá defender individualmente todas las soluciones del presente taller en la clase presencial, y en base a esta defensa, de le asignará la calificación individualmente (pese a ser un taller grupal).
* Leer detenidamente cada problemática propuesta.
* Programa/codifíque con el lenguaje de alto nivel Java (IDE NetBeans), sus soluciones a cada uno de los problemas listados a continuación. 
* Para cada programa, genere una clase independiente pero dentro de un solo/único proyecto Java App. (NO CREE VARIOS PROYECTOS, ni los empaquete, por favor, agregar los .java en el paquete por default). No olvide titular a cada clase, con el nombre representativo de la solución y con el número del problema de este listado. 
* Verificar que sus soluciones son correctas con las técnicas de compilación, ejecución y depurado de programas. Y con el objetivo de evidenciar los resultados, por favor, dentro de la misma clase (al final de todo el código), con los caracteres de bloque de comentarios, copie y pegue los resultados obtenidos por su solución, ejemplo: 

FORMATO:
```
/* BLOQUE DE COMENTARIOS */
```

EJEMPLO:
```
/* 
NOMBRES | ACD  | APE | AA  | PROMEDIOS
Juan S.  | 5,85   | 6,70   | 6,83   | 6,44   
Juan D.  | 0,92   | 3,44   | 6,55   | 3,49   
Ricardo  | 7,43   | 9,50   | 6,96   | 8,01   
Carlos   | 5,38   | 6,24   | 9,22   | 6,84    
 */ 
```


## Construcción de pseudocódigo usando arreglos bidimensionales / Matrices.

### Ejercicio 1

El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes: 

- Registre los nombres de cada estudiante de dicho paralelo.
- Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts. 
- Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
- Obtenga el promedio del curso, del paralelo C. 
- Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso. 
- Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso. 
- Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase). 
- Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase). 

### Ejercicio 2

Crea un programa que gestione el inventario de una tienda. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.

### Ejercicio 3

Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 12% del IVA, y si la compra superar los $100, se debe aplicar un descuento. 

Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva. 
Crea 

### Ejercicio 4

Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar sus movimientos alternativamente. El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.

### Ejercicio 5

Desarrolla una solución que permita multiplicar dos matrices bidimensionales. El usuario debe ingresar las dimensiones y los elementos de ambas matrices. Realiza la multiplicación y muestra el resultado al final. Nota: Las matrices se deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).


### Ejercicio 6

Desarrolla una solución en pseudocódigo que permita mediante un menú (al estilo calculadora matemática), facilitar las operaciones de suma, resta de dos matrices. Considerar la validación de las reglas para realizar estas operaciones. Nota: Las matrices se deben llenar con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9).

### Ejercicio 7

Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9) generados automáticamente, presente los elementos de la diagonal secundaria, los ubicados sobre la diagonal secundaria, y bajo dicha diagonal.

### Ejercicio 8

Dada una matriz cuadrada y con número aleatorios únicos enteros positivos o negativos (-9-0, 0-9) generados automáticamente, presente los elementos de la diagonal principal, los ubicados sobre la diagonal principal, y bajo dicha principal.

### Ejercicio 9

Con el objetivo de manipular correctamente los ciclos repetitivos anidados, se solicita, dado la altura de la salida, generar por pantalla las siguientes figuras. Nota: Ud. puede elegir libremente el caracter a mostrar en la figura. 

```
*
* *
* * *
* * * *
```
Ejemplo dado un límite de 4. 

### Ejercicio 10

Con el objetivo de manipular correctamente los ciclos repetitivos anidados, se solicita, dado la altura de las salida, generar por pantalla las siguientes figuras. Nota: Ud. puede elegir libremente el caracter a mostrar. Nota: Analice cual debería ser el límite correcto (mínimo y máximo) de la doble img para que sea una doble pirámide legible, validar ese dato de entrada. 

```
   *
  * *
 * * *
* * * *
 * * *
  * *
   *
```
Ejemplo dado un límite de 7. 

