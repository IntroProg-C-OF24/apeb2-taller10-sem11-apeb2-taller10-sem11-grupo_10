package debersemana9;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Matriz para almacenar productos: [ID][Nombre, Precio, Cantidad]
        String[][] inventario = new String[10][3];

        while (true) {
            System.out.println("\n--- Gestión de Inventario ---");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(inventario);
                    break;
                case 2:
                    actualizarExistencias(inventario);
                    break;
                case 3:
                    buscarProducto(inventario);
                    break;
                case 4:
                    eliminarProducto(inventario);
                    break;
                case 5:
                    mostrarInventario(inventario);
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

    private static void agregarProducto(String[][] inventario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Agregar Nuevo Producto ---");
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = scanner.nextInt();

        // Buscar una fila vacía en el inventario
        int fila = encontrarFilaVacia(inventario);

        if (fila != -1) {
            inventario[fila][0] = nombre;
            inventario[fila][1] = String.valueOf(precio);
            inventario[fila][2] = String.valueOf(cantidad);
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("El inventario está lleno. No se puede agregar más productos.");
        }
    }

    private static void actualizarExistencias(String[][] inventario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Actualizar Existencias ---");
        mostrarInventario(inventario);

        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombreBuscar = scanner.nextLine();

        int fila = buscarProductoPorNombre(inventario, nombreBuscar);

        if (fila != -1) {
            System.out.print("Ingrese la nueva cantidad disponible: ");
            int nuevaCantidad = scanner.nextInt();
            inventario[fila][2] = String.valueOf(nuevaCantidad);
            System.out.println("Existencias actualizadas correctamente.");
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    private static void buscarProducto(String[][] inventario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Buscar Producto ---");
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBuscar = scanner.nextLine();

        int fila = buscarProductoPorNombre(inventario, nombreBuscar);

        if (fila != -1) {
            System.out.println("Producto encontrado:");
            System.out.println("Nombre: " + inventario[fila][0]);
            System.out.println("Precio: $" + inventario[fila][1]);
            System.out.println("Cantidad disponible: " + inventario[fila][2]);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    private static void eliminarProducto(String[][] inventario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Eliminar Producto ---");
        mostrarInventario(inventario);

        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        int fila = buscarProductoPorNombre(inventario, nombreEliminar);

        if (fila != -1) {
            for (int i = 0; i < 3; i++) {
                inventario[fila][i] = null;
            }
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    private static void mostrarInventario(String[][] inventario) {
        System.out.println("\n--- Inventario ---");
        for (String[] producto : inventario) {
            if (producto[0] != null) {
                System.out.println("Nombre: " + producto[0]);
                System.out.println("Precio: $" + producto[1]);
                System.out.println("Cantidad disponible: " + producto[2]);
                System.out.println("----------------------");
            }
        }
    }

    private static int encontrarFilaVacia(String[][] inventario) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0] == null) {
                return i;
            }
        }
        return -1; 
    }

    private static int buscarProductoPorNombre(String[][] inventario, String nombre) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;  
    }
}
