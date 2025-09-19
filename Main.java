import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir tamaño del vector
        System.out.print("Ingrese el tamaño del vector de personas: ");
        int tamaño = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        vector vector = new vector(tamaño);

        int opcion;
        do {
            System.out.println("\n    MENÚ    ");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // Agregar
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("Altura (m) [Enter para dejar vacío]: ");
                    String alturaInput = sc.nextLine();
                    double altura = alturaInput.isEmpty() ? 0.0 : Double.parseDouble(alturaInput);

                    System.out.print("Peso (kg) [Enter para dejar vacío]: ");
                    String pesoInput = sc.nextLine();
                    double peso = pesoInput.isEmpty() ? 0.0 : Double.parseDouble(pesoInput);

                    Persona p = new Persona(nombre, apellido, altura, peso);
                    vector.agregarPersona(p);
                    break;

                case 2: // Mostrar
                    vector.mostrarPersonas();
                    break;

                case 3: // Eliminar
                    System.out.print("Ingrese el nombre de la persona a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    vector.eliminarPersona(nombreEliminar);
                    break;

                case 4: // Buscar
                    System.out.print("Ingrese el nombre de la persona a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    vector.buscarPersona(nombreBuscar);
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}

