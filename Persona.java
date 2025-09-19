public class Persona {
    private String nombre;
    private String apellido;
    private double altura; // puede quedar en 0.0
    private double peso;   // puede quedar en 0.0

    // Constructor flexible
    public Persona(String nombre, String apellido, double altura, double peso) {
        this.nombre = nombre;     
        this.apellido = apellido; 
        this.altura = altura;     
        this.peso = peso;         
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    // Mostrar info de forma flexible
    public void mostrarInfo() {
        System.out.println("Nombre: " + (nombre != null && !nombre.isEmpty() ? nombre : "(no ingresado)"));
        System.out.println("Apellido: " + (apellido != null && !apellido.isEmpty() ? apellido : "(no ingresado)"));
        System.out.println("Altura: " + (altura > 0 ? altura : "(no ingresada)"));
        System.out.println("Peso: " + (peso > 0 ? peso : "(no ingresado)"));
    }
}
