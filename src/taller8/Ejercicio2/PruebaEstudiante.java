package taller8.Ejercicio2;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Laura Ramírez", 20, "7502610040");
        Estudiante est2 = new Estudiante("Andrés Ruiz", 22, "7502610067");

        est1.mostrarDetalles();
        System.out.println("---");
        est2.mostrarDetalles();
    }
}