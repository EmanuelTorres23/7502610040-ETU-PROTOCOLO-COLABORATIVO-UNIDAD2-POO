package taller8.Ejercicio3;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos Pérez", 1500000);
        Gerente gerente = new Gerente("Ana Gómez", 3000000, "Ventas");

        System.out.println("-Empleado-");
        empleado.mostrarDetalles();
        System.out.println("-Gerente-");
        gerente.mostrarDetalles();
    }
}