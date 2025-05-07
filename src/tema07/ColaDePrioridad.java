package tema07;

import java.util.ArrayList;

/**
 * Clase que implementa una cola de prioridad mediante un montículo de mínimos
 * El hijo izquierdo de un nodo k: 2k+1
 * El hijo derecho de un nodo k: 2k+2
 * Padre de un elemento k: (k-1)//2 (división entera)
 */
public class ColaDePrioridad {

    private final ArrayList<Nodo> cola;   // Estructura de soporte de los datos

    /**
     * Constructor de la cola: inicializa la lista de soporte
     */
    public ColaDePrioridad() {
        this.cola = new ArrayList<>();
    }

    /**
     * Inserción de un nuevo elemento en la cola
     * @param valor valor insertado
     * @param prioridad prioridad del elemento
     */
    public void insertar(String valor, int prioridad) {
        Nodo nuevoNodo = new Nodo(valor, prioridad);
        cola.add(nuevoNodo);    // Inserción al final de la cola
        upHeap(cola.size() - 1); // heapify desde la nueva hoja hacia arriba
    }

    /**
     * Extracción del elemento con mayor priodidad (menor valor de prioridad)
     * @return elemento desencolado
     */
    public Nodo desencolar() {
        if (cola.isEmpty()) {
            // Devolver null si la cola está vacía
            return null;
        }
        Nodo raiz = cola.get(0);   // Guardamos el nodo raíz, lo devolvemos al final
        Nodo ultimo = cola.remove(cola.size() - 1);   // Borrar el último nodo
        if (!cola.isEmpty()) {
            cola.set(0, ultimo);
            downHeap(0);    // Heapify desde la raíz
        }
        return raiz;
    }

    /**
     * Representación de la cola de prioridad
     * @return representación en formato String de la cola
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Nodo nodo : cola) {
            sb.append(nodo);
            sb.append(" ");
        }
        return sb.toString();
    }

    /**
     * Up-Head del nodo en la posición indicada
     * heapifu hacia arriba
     * @param k índice del nodo de partida
     */
    private void upHeap(int k) {
        if (k > 0) {
            // No estamos en el nodo raíz del montículo
            int posicionPadre = (k - 1) / 2;    // división entera
            Nodo nodoActual = cola.get(k);
            Nodo nodoPadre = cola.get(posicionPadre);
            if (nodoActual.prioridad < nodoPadre.prioridad) {
                // El padre tiene menor prioridad
                Nodo temp = nodoActual;                 // Guardar el hijo en temp
                cola.set(k, nodoPadre);                 // Sobreescribir el hijo con el padre
                cola.set(posicionPadre, temp);          // Sobreescribir el padre con temp
                // O podría hacerse así:
                // Collections.swap(cola, k, posicionPadre);
                upHeap(posicionPadre);                  // Llamada recursiva sobre el padre
            }
        }
    }

    /**
     * Down-Head del nodo en la posición indicada
     * heapifu hacia abajo
     * @param k índice del nodo de partida
     */
    private void downHeap(int k) {
        int posicionHijoIzquierdo = 2 * k + 1;
        int posicionHijoDerecho = 2 * k + 2;
        Nodo hijoIzquierdo, hijoDerecho, nodoActual = cola.get(k);
        int posicionHijoIntercambio;    // Posición del hijo con el que intercambiar el nodo
        // Buscar la posición del hijo menor
        if (posicionHijoIzquierdo < cola.size()) {          // Comprobar si existe hijo izquierdo
            hijoIzquierdo = cola.get(posicionHijoIzquierdo);
            posicionHijoIntercambio = posicionHijoIzquierdo;
            if (posicionHijoDerecho < cola.size()) {        // Comprobar si existe hijo derecho
                hijoDerecho = cola.get(posicionHijoDerecho);
                if (hijoDerecho.prioridad < hijoIzquierdo.prioridad)
                    posicionHijoIntercambio = posicionHijoDerecho;
            }

            // ¿Intercambio de padre e hijo seleccionado?
            if (nodoActual.prioridad > cola.get(posicionHijoIntercambio).prioridad) {
                // El valor de la prioridad del padre es mayor que la del hijo
                cola.set(k, cola.get(posicionHijoIntercambio)); // Sobreescribir el padre con el hijo seleccionado
                cola.set(posicionHijoIntercambio, nodoActual);  // Sobreescribir el hijo menor con el padre
                downHeap(posicionHijoIntercambio);              // Llamada recursiva sobre el hijo
            }
        }
    }
}

