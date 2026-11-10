package taller8.Ejercicio4;

// public class Coche extends Vehiculo {
//
//     public Coche(String marca) {
//         super(marca);
//     }
//
//     public void mostrarMarca() {
//         System.out.println(marca); // Error aquí
//     }
// }
//
// Error de compilación:
// "'marca' has private access in 'Vehiculo'"

//¿Por qué está mal? marca es private, así que solo puede usarlo el código dentro de Vehiculo. Aunque Coche hereda de
// Vehiculo, el atributo no es visible desde Coche. La forma correcta es pasar el valor al constructor de la clase base
// con super(marca), o usar un método public o protected de Vehiculo que devuelva el valor.