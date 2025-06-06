package tema09.grafomatriz;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Clase que implementa un grafo no dirigido empleando una matriz de adyacencias
 */
public class Grafo {
    private double[][] matriz;  // COntiene la información de adyacencias
    private int numNodos;       // Número de nodos que contiene el grafo
    private int numAristas;     // Número de aristas que contiene el grafo

    // Otras estructuras de soporte
    private LinkedList<String> claves;  // claves de los nodos del grafo
    private LinkedList<NodoGrafo> nodos;    // Contiene los nodos del grafo
    // Observemos que en este caso el grafo no conoce el tipo concreto de dato en cada nodo.
    // SOlo le interesa que implemente un método getCLave de tipo String.


    /**
     * Constructor del grafo
     * Crea un grafo vacío
     */
    public Grafo() {
        numAristas = numNodos = 0;
        claves = new LinkedList<>();
        nodos = new LinkedList<>();
        matriz = new double[10][10];    // Inicialmente tenremos espacio para almacenar hasta 10 nodos y sus aristas.
    }

    /**
     * Inserta un nuevo nodo en el grafo
     * @param nodo nodo a insertar
     * @return true si la inserción tiene éxito.
     */
    public boolean insertarNodo(NodoGrafo nodo) {
        String clave = nodo.getClave();     // Obtnemos la clave del nodo.
        double[][] nuevaMatriz;             // nueva matriz en el caso de que necesitemos duplicar tamaño

        if (claves.contains(clave))
            return false;   // La clave a insertar (nodo correspondiente) ya está en el grafo.

        claves.add(clave);      // Añadimos la nueva clave a la lista
        nodos.add(nodo);        // Añadimos el nuevo nodo a la lista
        if (numNodos + 1 > matriz.length) {
            // Duplicar el tamaño de la matriz
            nuevaMatriz = new double[numNodos*2][numNodos*2];
            // Copiar la información de la matriz actual a la nueva creada
            for (int i = 0; i < numNodos; i++) {
                for (int j = 0; j < numNodos; j++) {
                    nuevaMatriz[i][j] = matriz[i][j];   // Copiar valor
                }
            }
            // Elementos copiados, actualizar referencia:
            matriz = nuevaMatriz;
        }
        numNodos++;     // Incrementamos el contador del número de nodos.
        return true;    // el nodo se ha insertado.
    }

    /**
     * Comprueba si existe un nodo dado por su clave
     * @param clave clave del nodo a consultar
     * @return true si el nodo existe
     */
    public boolean existeNodo(String clave) {
        return claves.contains(clave);
    }

    /**
     * Devuelve del número de nodos del grafo
     * @return número de nodos.
     */
    public int numeroNodos() {
        return numNodos;
    }


    /**
     * Inserción de una nueva arista entre dos nodos dados por sus claves
     * @param clave1 clave del primer nodo
     * @param clave2 clave del segundo nodo
     * @param peso ponderación de la arista
     * @return true si la inserción tiene éxito.
     */
    public boolean insertarArista(String clave1, String clave2, Double peso) {
        // Comprobamos la existencia de los nodos
        if (!existeNodo(clave1) || !existeNodo(clave2)) {
            return false;   // No podemos insertar la arista.
        }

        // Aquí podríamos comprobar si la arista ya existe en el grafo.
        // Si existe, podríamos no hacer nada, o actualizar la información.
        // Podría haber un método separado para actualizar una arista.
        // if (existeArista(clave1, clave2)) return false;

        int indiceClave1 = claves.indexOf(clave1);  // índice en la matriz de la clave1
        int indiceClave2 = claves.indexOf(clave2);  // índice en la matriz de la clave2

        // Actualizar la matriz de adyacencias:
        matriz[indiceClave1][indiceClave2] = matriz[indiceClave2][indiceClave1] = peso;
        numAristas++;   // Incrementamos el número de aristas almacenado.
        return true;
    }

    /**
     * Comprueba si una arista entre dos nodos existe ene l grafo
     * @param clave1 clave del primer nodo
     * @param clave2 clave del segundo nodo
     * @return true si la arista existe
     */
    public boolean existeArista(String clave1, String clave2) {
        if (!existeNodo(clave1) || !existeNodo(clave2)) {
            // no están los nodos, no puede estar la arista:
            return false;
        }
        // Buscar la arista en la matriz de soporte.
        // Primer obtenemos los índices de los nodos:
        int indiceClave1 = claves.indexOf(clave1);  // índice en la matriz de la clave1
        int indiceClave2 = claves.indexOf(clave2);  // índice en la matriz de la clave2
        return matriz[indiceClave1][indiceClave2] != 0; // Comprobamos si existe esta adyacencia.
    }

    /**
     * Devuelve el número de aristas en el grafo
     * @return número de aristas
     */
    public int numeroAristas() {
        return numAristas;
    }

    /**
     * elimina una arista del grafo
     * @param clave1 clave del primer nodo
     * @param clave2 clave del segundo nodo
     * @return true si se ha podido eliminar
     */
    public boolean borrarArista(String clave1, String clave2) {
        // Comprobamos la existencia de la arista
        if (!existeArista(clave1, clave2)) return false; // La arista no existe; no se puede eliminar
        // Buscar la arista en la matriz de soporte.
        // Primer obtenemos los índices de los nodos:
        int indiceClave1 = claves.indexOf(clave1);  // índice en la matriz de la clave1
        int indiceClave2 = claves.indexOf(clave2);  // índice en la matriz de la clave2
        matriz[indiceClave1][indiceClave2] = matriz[indiceClave2][indiceClave1] = 0;    // borramos la arista
        numAristas--;
        return true;
    }

    /**
     * Borra un nodo del grafo dado por su clave
     * @param clave clave del nodo a borrar
     * @return true si se ha podido borrar
     */
    public boolean borrarNodo(String clave) {
        // Comprobar que el nodo está en el grafo:
        if (!claves.contains(clave)) return false;

        // Obtenemos el índnice del nodo:
        int indice = claves.indexOf(clave);
        claves.remove(indice);
        nodos.remove(indice);
        numNodos--;
        // Eliminar la fila y la columna asociadas a este nodo de la matriz de adyacencias.
        matriz = reducirMatrizCuadrada(matriz, indice);
        return true;
    }

    /**
     * Elimina de una matriz cuadrada la fila y la columna en laposición indice
     * @param mat matriz original
     * @param indice indice de la fila y columna a eliminar
     * @return matriz reducida
     */
    private double[][] reducirMatrizCuadrada(double[][] mat, int indice) {
        // Comprobaciones previas
        if (mat == null || mat.length == 1 || indice < 0 || indice >= mat.length)
            return null;

        // Crear la matriz reducida con una fila y una columna menos que la original
        int len = mat.length;
        double[][] matReducida = new double[len - 1][len - 1];

        int fila = 0;     // índice para recorrer las filas en la matriz reducida
        int columna = 0;  // índice para recorrer las columnas en la matriz reducida

        // Copiar filas y columnas excepto la fila y columna en "indice"
        for (int i = 0; i < len; i++) {
            if (i == indice) continue; // Saltar la fila a eliminar
            for (int j = 0; j < len; j++) {
                if (j == indice) continue; // Saltar la columna a eliminar
                matReducida[fila][columna] = mat[i][j];
                columna++;
            }
            fila++;
        }
        return matReducida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (numNodos == 0) {
            return "Grafo vacío";
        }

        for (int i = 0; i < numNodos; i++) {
            String clave = claves.get(i);
            sb.append(clave).append(": ");
            for (int j = 0; j < numNodos; j++) {
                if (matriz[i][j] > 0) {
                    sb.append(claves.get(j));
                    sb.append("(");
                    sb.append(matriz[i][j]);
                    sb.append(") ");
                }
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
