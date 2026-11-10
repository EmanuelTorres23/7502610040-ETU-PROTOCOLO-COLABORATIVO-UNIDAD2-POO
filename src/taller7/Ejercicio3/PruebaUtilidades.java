package taller7.Ejercicio3;

public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.sumar(10, 5));
        System.out.println("Resta: " + Utilidades.restar(10, 5));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(10, 5));
        System.out.println("División: " + Utilidades.dividir(10, 5));
        System.out.println("División entre cero: " + Utilidades.dividir(10, 0));
    }
}