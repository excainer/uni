public class vector {
    private Persona[] personas;
    private int contador;

    public vector(int tamaño) {
        personas = new Persona[tamaño];
        contador = 0;
    }

    public void agregarPersona(Persona p) {
        if (contador < personas.length) {
            personas[contador] = p;
            contador++;
            System.out.println("Persona agregada correctamente.");
        } else {
            System.out.println("El vector está lleno, no se puede agregar más personas.");
        }
    }

    public void mostrarPersonas() {
        if (contador == 0) {
            System.out.println("No hay personas registradas.");
            return;
        }
        System.out.println("\n LISTA DE PERSONAS ");
        for (int i = 0; i < contador; i++) {
            System.out.println("Persona #" + (i + 1));
            personas[i].mostrarInfo(); // aquí imprime la info de cada persona
        }
    }

    public void eliminarPersona(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                // desplazar elementos hacia la izquierda
                for (int j = i; j < contador - 1; j++) {
                    personas[j] = personas[j + 1];
                }
                personas[contador - 1] = null;
                contador--;
                encontrado = true;
                System.out.println("Persona eliminada correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró a la persona con nombre: " + nombre);
        }
    }

    public void buscarPersona(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (personas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Persona encontrada:");
                personas[i].mostrarInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró a la persona con nombre: " + nombre);
        }
    }
}
