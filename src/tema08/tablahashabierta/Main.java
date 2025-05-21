package tema08.tablahashabierta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        TablaHashAbierta tabla = new TablaHashAbierta(11);

        // Generación de elementos para su inserción en la tabla
        // Se generan aleatoriamente las claves, y el valor asociado a la clave es el índice del bucle
        int numeroElementos = 24;         // Número de elementos
        int longitudMaximaClave = 5;       // Longitud máxima de las claves
        int longitudClave;                // Longitud de la clave en proceso de generación
        int i, j;                           // Índices para bucles
        int caracter;                     // caracter que forma parte de la clave (ASCII DE A=65 y de Z=90)
        String clave;                     // clave generada
        Elemento elemento;                // Elemento que se inserta en la tabla hash


        i = 0;
        while (i < numeroElementos) {
            // Generación de la clave
            longitudClave = (int) (Math.random() * longitudMaximaClave) + 1;   // valor entre 1 y longitudMaximaClave
            clave = "";
            for (j = 0; j < longitudClave; j++) {
                caracter = 65 + (int) (Math.random() * 26);    // Número aleatorio entre 65 y 90
                clave += (char) caracter;
            }

            // Inserción del elemento en la tabla
            System.out.println("Inserción del elemento (clave: " + clave + ", valor:" + i + ")");
            tabla.insertar(clave, i);
            System.out.println(tabla);
            i++;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                reader.readLine(); // Espera a que el usuario presione Enter
            } catch (IOException e) {
                System.out.println(e);
            }


        }

    }

}
