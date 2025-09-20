public class Persona {
    private String nombre;
    private String apellido;
    private double altura;
    private double peso;

    public Persona(String nombre, String apellido, double altura, double peso) {
        this.nombre = (nombre == null || nombre.isEmpty()) ? "Desconocido" : nombre;
        this.apellido = (apellido == null || apellido.isEmpty()) ? "Desconocido" : apellido;
        this.altura = altura; 
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.isEmpty()) ? "Desconocido" : nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = (apellido == null || apellido.isEmpty()) ? "Desconocido" : apellido;
    }

    public void setAltura(double altura) {
        this.altura = altura; 
    }

    public void setPeso(double peso) {
        this.peso = peso; 
    }

    //  Mostrar información 
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Altura: " + (altura > 0 ? altura + " m" : "No registrada"));
        System.out.println("Peso: " + (peso > 0 ? peso + " kg" : "No registrado"));
    }
}
