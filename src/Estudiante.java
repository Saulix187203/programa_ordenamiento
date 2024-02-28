public class Estudiante {
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private int nota;
    private int grado;

    // Constructor
    public Estudiante(String nombre, int edad, double peso, double estatura, int nota, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.nota = nota;
        this.grado = grado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura
                + ", nota="
                + nota + ", grado=" + grado + "]";
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // (No los incluiré todos por brevedad)
}
