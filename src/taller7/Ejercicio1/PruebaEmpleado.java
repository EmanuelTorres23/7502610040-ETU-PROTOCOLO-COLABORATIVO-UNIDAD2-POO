package taller7.Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Carlos Torres", 1500000);
        Empleado emp2 = new Empleado("Ana Gómez", 1200000);

        System.out.println("Nombre: " + emp1.nombre);
        System.out.println("Salario: " + emp1.getSalario());

        emp1.setSalario(1800000);
        System.out.println("Nuevo salario: " + emp1.getSalario());

        emp2.setSalario(-500);
        System.out.println("Salario de " + emp2.nombre + ": " + emp2.getSalario());

        emp2.nombre = "Ana María Gómez";
        System.out.println("Nombre: " + emp2.nombre);
    }
}