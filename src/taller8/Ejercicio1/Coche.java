package taller8.Ejercicio1;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}