package debersemana9;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[][] inventario = {
                {"001", "Producto1", "10.50", "50"},
                {"002", "Producto2", "20.75", "30"},
                {"003", "Producto3", "5.99", "100"}
        };

        while (true) {
            System.out.println("\n--- Gestión de Inventario y Facturación ---");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Facturar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInventario(inventario);
                    break;
                case 2:
                    facturarProducto(inventario);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void mostrarInventario(String[][] inventario) {
        System.out.println("\n--- Inventario ---");
        for (String[] producto : inventario) {
            System.out.println("Código: " + producto[0]);
            System.out.println("Nombre: " + producto[1]);
            System.out.println("Precio: $" + producto[2]);
            System.out.println("Cantidad disponible: " + producto[3]);
            System.out.println("----------------------");
        }
    }

    private static void facturarProducto(String[][] inventario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Facturación ---");
        mostrarInventario(inventario);

        System.out.print("Ingrese el código del producto a facturar: ");
        String codigoProducto = scanner.next();

        int indiceProducto = buscarProductoPorCodigo(inventario, codigoProducto);

        if (indiceProducto != -1) {
            System.out.print("Ingrese la cantidad deseada: ");
            int cantidadDeseada = scanner.nextInt();
            double precioUnitario = Double.parseDouble(inventario[indiceProducto][2]);
            double subtotal = precioUnitario * cantidadDeseada;
            double iva = subtotal * 0.12;
            double total = subtotal + iva;
            if (total > 100) {
                total *= 0.9; 
            }

            int cantidadDisponible = Integer.parseInt(inventario[indiceProducto][3]);
            if (cantidadDeseada <= cantidadDisponible) {
                cantidadDisponible -= cantidadDeseada;
                inventario[indiceProducto][3] = String.valueOf(cantidadDisponible);

                // Mostrar factura
                System.out.println("\n--- Factura ---");
                System.out.println("Producto: " + inventario[indiceProducto][1]);
                System.out.println("Cantidad: " + cantidadDeseada);
                System.out.println("Precio Unitario: $" + precioUnitario);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("IVA (12%): $" + iva);
                System.out.println("Total: $" + total);
                System.out.println("¡Compra realizada con éxito!");
            } else {
                System.out.println("No hay suficientes unidades disponibles en el inventario.");
            }
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    private static int buscarProductoPorCodigo(String[][] inventario, String codigo) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0].equals(codigo)) {
                return i;
            }
        }
        return -1; 
        
    }
        
}
