package debersemana9;
import java.util.Random;
public class DeberSemana9 {
    public static void main(String[] args) {
        String[] nombres = new String[28];
        double[] acd = new double[28];
        double[] ape = new double[28];
        double[] aa = new double[28];
        double[] promedio = new double[28];

        // Generar aleatoriamente las notas de los estudiantes
        Random random = new Random();
        for (int i = 0; i < 28; i++) {
            nombres[i] = "Estudiante" + (i + 1);
            acd[i] = random.nextDouble() * 10;
            ape[i] = random.nextDouble() * 10;
            aa[i] = random.nextDouble() * 10;
            promedio[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.30);
        }

        // Calcular promedio del curso
        double promedioCurso = calcularPromedio(promedio);

        // Filtrar estudiantes por encima y por debajo del promedio del curso
        System.out.println("Estudiantes por encima del promedio del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedio[i] > promedioCurso) {
                System.out.println(nombres[i] + ": " + promedio[i]);
            }
        }

        System.out.println("\nEstudiantes por debajo del promedio del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedio[i] < promedioCurso) {
                System.out.println(nombres[i] + ": " + promedio[i]);
            }
        }

        // Encontrar al estudiante con el mayor y menor promedio
        int indiceMayor = obtenerIndiceExtremo(promedio, true);
        int indiceMenor = obtenerIndiceExtremo(promedio, false);

        // Mostrar resultados
        System.out.println("\nEstudiante con el mayor promedio: " + nombres[indiceMayor] + " - " + promedio[indiceMayor]);
        System.out.println("Estudiante con el menor promedio: " + nombres[indiceMenor] + " - " + promedio[indiceMenor]);
    }

    private static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    private static int obtenerIndiceExtremo(double[] valores, boolean esMaximo) {
        int indiceExtremo = 0;
        for (int i = 1; i < valores.length; i++) {
            if ((esMaximo && valores[i] > valores[indiceExtremo]) || (!esMaximo && valores[i] < valores[indiceExtremo])) {
                indiceExtremo = i;
            }
        }
        return indiceExtremo;
    }
    
}
