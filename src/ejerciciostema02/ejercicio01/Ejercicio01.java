package ejerciciostema02.ejercicio01;

/**
 * Escribir un programa que defina tres arrays: a, b, y c, de tipo int.
 * Cada array debe tener 10 elementos.
 * Los valores del array a son: 1, 2, 3, ..., 10
 * Los valores del array b son: -1, -2, -3, ..., -10
 * El valor de cada elemento del array c se determina por la siguiente fórmula:
 * c[i] = a[i] + b[i], i=0...9
 * Finalmente, mostrar en pantalla el contenido de los tres arrays
 * -------------------------------------------------------------------------------
 * Ejemplo de salida esperada:
 *--------------------------------------------------------------------------------
 * Contenido de a:
 * 1 2 3 4 5 6 7 8 9 10
 * Contenido de b:
 * -1 -2 -3 -4 -5 -6 -7 -8 -9 -10
 * Contenido de b:
 * 0 0 0 0 0 0 0 0 0 0
 */

/**
 * Artículos relacionados: https://www.freecodecamp.org/espanol/news/como-imprimir-arreglos-en-java/
 */

/**
 * Solución 1
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Declaración de las variables
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        // Inicialización de valores
        for (int i = 0; i < 10; i++) {
            a[i] = i+1;
        }
        for (int i = 0; i < 10; i++) {
            b[i] = -(i+1);
        }
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] + b[i];
        }
        // Mostrar resultados
        System.out.println("\nContenido de a: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nContenido de b: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nContenido de c: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

/**
 * Solución 2
 */
/*public class Ejercicio1 {
    static void mostrarVector(int[] vector, String nombre) {
        System.out.println("\nContenido de " + nombre + ": ");
        for (int j : vector) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        // Declaración de las variables
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        // Inicialización de valores
        for (int i = 0; i < 10; i++) {
            a[i] = i+1;
            b[i] = -a[i];
            c[i] = a[i] + b[i];
        }
        // Mostrar resultados
        Ejercicio1.mostrarVector(a, "a");
        Ejercicio1.mostrarVector(b, "b");
        Ejercicio1.mostrarVector(c, "c");
    }
}*/

/**
 * Solución 3
 */
/*
public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaración de las variables: a y b
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        // Variable c:
        int[] c = new int[10];
        // Inicialización de valores
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] + b[i];
        }
        // Mostrar resultados
        System.out.println("\nContenido de a: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nContenido de b: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nContenido de c: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}*/
