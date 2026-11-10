package taller7.Ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("0012345", 500000, "Ahorros");

        System.out.println("Tipo: " + cuenta.tipoCuenta);
        System.out.println("Saldo: " + cuenta.getSaldo());

        cuenta.setSaldo(750000);
        cuenta.mostrarDetalles();

        // System.out.println(cuenta.numeroCuenta);
        // Error de compilación (IntelliJ):
        // "'numeroCuenta' has private access in 'CuentaBancaria'"
    }
}