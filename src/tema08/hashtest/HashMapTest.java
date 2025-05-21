package tema08.hashtest;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // TreeMap<Integer, Integer> map = new TreeMap<>();

        Random random = new Random();

        // Distintos tamaños de datos con los que probaremos
        int[] testSize = {1000, 10000, 100000, 1000000, 10000000};

        // Encabezado formateado de la información a mostrar en dos columnas
        System.out.printf("%-15s %-15s\n", "nº Elementos", "Tiempo (ms)");

        for (int n : testSize) {
            map.clear();

            // Llenar el HashMap con n elementos
            for (int i = 0; i < n; i++) {
                map.put(i, i);
            }

            // Tiempo inicial
            long inicio = System.nanoTime();

            // Realizar 100000 búsquedas aleatorias
            for (int i = 0; i < 100000; i++) {
                // Generar clave aleataoria en el intervalo [0, n]
                int key = random.nextInt(n);
                // Acceder a la clave dentro de la tabla
                map.get(key);
            }

            // Tiempo final
            long fin = System.nanoTime();

            // Calcular tiempo de acceso y convertirlo a milisegundos
            double t = (fin - inicio) / 1000000.0;
            System.out.printf("%-15d %-15.3f\n", n, t);
        }
    }
}
