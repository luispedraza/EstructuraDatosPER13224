package ejerciciostema02.ejercicio03;

import java.util.Arrays;

public class Apuesta {

    private int[] numeros;              // los números que contiene la apuesta (en general 5)
    private int numerosElegidos = 0;    // Es la cantidad de números que ya se han incluido en la apuesta

    /**
     * Constructor por defecto: apuestas de 5 números
     */
    public Apuesta() {
        this.numeros = new int[5];
    }

    public Apuesta(int cantidad) {
        this.numeros = new int[cantidad];
    }

    // Escribir primero métodos de ayuda. No es necesario que sean públicos

    /**
     * Indica si la apuesta está completa: se han elegido todos los números
     *
     * @return: true si la apuesta está completa
     */
    private boolean completa() {
        return numerosElegidos == numeros.length;
    }

    /**
     * Encuentra la posición del número facilitado dentro del vector de números de la apesta
     *
     * @param numero: valor buscado
     * @return: posición del valor, -1 si no se encuentra
     */
    private int indiceDe(int numero) {
        for (int i = 0; i < numerosElegidos; i++) {
            if (numero == numeros[i]) {
                return i; // se sale del método devolviendo el índice corecto
            }
        }
        // Si llegamos aquí es porque el valor no se ha encontrado
        return -1;
    }

    /**
     * Inserta un nuevo número en la apuesta
     *
     * @param numero: número que se quiere añadir
     * @return: true si se ha insertado, false si no ha sido posible (apuesta completa o número ya existe)
     */
    public boolean insertar(int numero) {
        if (completa()) {
            System.out.println("La apuesta está completa. Elimine un número si quiere agregar otro nuevo.");
            return false;
        }
        if (indiceDe(numero) >= 0) {
            System.out.println("El número " + numero + " ya está en la combinación seleccionada");
            return false;
        }
        // Agregamos el nuevo número al final de la lista
        numeros[numerosElegidos] = numero;
        numerosElegidos++;
        System.out.println("Incluido el número: " + numero);
        return true;
    }

    /**
     * Borra un número de la apuesta.
     *
     * @param numero: número que se desea borrar
     * @return: true si se ha podido eliminar el valor.
     */
    public boolean borrar(int numero) {
        int posicion = indiceDe(numero);
        if (posicion < 0) {
            System.out.println("No se pudo eliminar; el valor " + numero + " no está en la apuesta.");
            return false;
        }
        // La variable posicion almacena el índice del valor a borrar. Hay que desplazar
        // una posición hacia la izquierda todos los números a continuación de este
        // y decrementar la variable numerosElegidos
        for (int i = posicion; i < numerosElegidos - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numerosElegidos--;
        System.out.println("Borrado el número: " + numero);
        return true;
    }

    @Override
    public String toString() {
        // Debemos mostrar solo los números actualmente incluidos en la apuesta
        int[] apuestaActual = new int[numerosElegidos];
        for (int i = 0; i < numerosElegidos; i++) {
            apuestaActual[i] = numeros[i];
        }
        return "Apuesta{" +
                "numeros=" + Arrays.toString(apuestaActual) +
                '}';
    }
}
