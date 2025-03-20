package ejerciciostema02.ejercicio03;

/**
 * Programa para probar la clase Apuesta
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Apuesta nuevaApuesta = new Apuesta();
        nuevaApuesta.borrar(2);     // Se borra un valor en una apuesta vacía
        nuevaApuesta.insertar(1);   // Se inserta un nuevo valor
        nuevaApuesta.insertar(50);  // Se inserta un nuevo valor
        nuevaApuesta.insertar(50);  // Se inserta un valor que ya está en la apuesta
        nuevaApuesta.insertar(75);  // Se inserta un nuevo valor
        nuevaApuesta.insertar(46);  // Se inserta un nuevo valor
        nuevaApuesta.insertar(13);  // Se inserta un nuevo valor
        nuevaApuesta.insertar(10);  // Se inserta un nuevo valor, pero la apuesta está completa
        System.out.println(nuevaApuesta);   // Se muestra el contenido de la apuesta
        nuevaApuesta.borrar(75);    // Se borra un número de la apuesta
        nuevaApuesta.borrar(17);    // Se borra un número que no está en la apuesta
        System.out.println(nuevaApuesta);   // Se muestra el contenido de la apuesta
        nuevaApuesta.insertar(10);  // Se inserta un nuevo valor
        System.out.println(nuevaApuesta);   // Se muestra el contenido de la apuesta

    }
}
