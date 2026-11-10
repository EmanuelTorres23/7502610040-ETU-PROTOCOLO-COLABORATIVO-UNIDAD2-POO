package taller8.Ejercicio4;

// public class ClaseC extends ClaseA, ClaseB {
// }
//
// Error de compilación:
// "'{' expected"

//¿Por qué está mal? extends solo acepta un nombre de clase. Al encontrar la coma, el compilador espera la llave
// { que abre el cuerpo de la clase. Java no admite herencia múltiple de clases porque, si dos clases base tuvieran
// un método con el mismo nombre, no sabría cuál usar (el problema del diamante). Si una clase necesita varios
//  comportamientos, se usan interfaces, como en los talleres 11 y 12.