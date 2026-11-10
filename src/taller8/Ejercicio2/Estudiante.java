package taller8.Ejercicio2;

public class Estudiante extends Persona {
    private String Código;

    public Estudiante(String nombre, int edad, String Código) {
        super(nombre, edad);
        this.Código = Código;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Código: " + Código);
    }
}