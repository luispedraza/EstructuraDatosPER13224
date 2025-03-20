package ejerciciostema01.ejercicio03;

/**
 * Completar la clase Complex para representar números complejos con métodos para obtener y establecer valores
 * de los atributos, y una versión del método toString. Implementar una clase principal en la que, su método main,
 * genere cinco números complejos empleando un bucle. Cada uno de ellos debe tener idénticas sus componentes real
 * y compleja (el primero será el número (1, 1i), el segundo el número (2, 2i), el tercero el número (3, 3i)
 * y así sucesivamente). Finalmente, el programa debe mostrar los 5 números por consola.
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Complex c;

        for (int i = 1; i < 6; i++) {
            c = new Complex(i, i);
            System.out.println(c);
        }

    }
}
