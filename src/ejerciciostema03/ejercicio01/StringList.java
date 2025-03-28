package ejerciciostema03.ejercicio01;

/**
 * Este es el código de partida para los ejercicios 1 a 4
 * Clase StringList
 */

public class StringList {
    protected Node first;
    protected Node last;
    protected int numElems;

    public StringList() {
        first = null;
        last = null;
        numElems = 0;
    }

    /**
     * Operación Añadir(elemento)
     * Se añade el elemento del argumento al final de la lista
     * Se incrementa el contador numElems
     * @param str: String que se desea añadir a la lista
     */
    public void add(String str) {
        Node node = new Node(str);  // Crear el nuevo nodo
        if (first == null) {
            // la lista está vacía
            first = node;
            last = node;
        } else {
            // la lista NO está vacía
            last.next = node;
            last = node;
        }
        numElems++;         // Se incrementa el contado de elementos de la lista
    }

    /**
     * Operación Obtener(posición)
     * @param index: posición o índice del elemento
     * @return: el elemento si se encuentra, o null si no se encuentra
     */
    public String get(int index) {
        int i;
        if (index < 0 || index >= numElems)
            return null;
        else {
            Node aux = first;
            for (i = 0; i < index; i++)
                aux = aux.next;
            return aux.data;
        }
    }

    /**
     * Operación Localizar(elemento)
     * @param str: Datos del elemento que se busca
     * @return: el índice del elemento si se encuentra, o -1 si no se encuentra
     */
    public int indexOf(String str) {
        int index = 0;
        Node aux = first;
        while (aux != null && aux.data != str) {
            aux = aux.next;
            index++;
        }
        if (aux == null)
            return -1;      // No se ha encontrado el elemento
        else
            return index;   // Se devuelve el índice del elemento

    }

    /**
     * Operación Borrar(posición)
     * Si el elemento está en la lista se elimina y se decrementa el contador numElems, se devuelve true
     * Si el elemento no está se devuelve false
     * @param index: índice del elemento que se desea borrar
     * @return: true si se ha podido eliminar, false en caso contrario
     */
    public boolean delete(int index) {
        Node prev, current;
        int i;

        if ((index < 0) || (index >= numElems))
            // El índice está fuera del rango de validez
            return false;

        // Caso especial lista de un elemento
        if (numElems == 1) {
            first = null;
            last = null;
            numElems = 0;   // la lista queda vacía
            return true;
        }

        // Caso especial: borrado del primer elemento
        // Recordar que en este punto, la lista es de más de un elemento (al menos dos)
        if (index == 0) {
            first = first.next;
            numElems -= 1;  // Se decrementa el contador de elementos
            return true;
        }

        // A partir de aquí, la lista es de más de un elemento
        // y el índice que se quiere borrar no es el primero
        prev = first;
        current = first;

        // Bucle para posicionar los punteros current y prev
        for (i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }

        // current apunta al nodo que se quiere borrar
        // prev apunta a nodo anterior
        // enlazar el prev con el next de current
        // con esto queda eliminado de la lista current
        prev.next = current.next;

        // ajustar el puntero last si es necesario (se ha borrado el último elemento)
        if (last == current)
            last = prev;
        numElems -= 1;  // Se decrementa el contador de elementos
        return true;
    }

    /**
     * Operación Tamaño()
     * @return: número de elementos contenidos en la lista
     */
    int size() {
        // return numElems; // Implementación trivial
        Node aux = first;
        int elements = 0;
        while (aux != null) {
            elements++; // incrementamos la cuenta
            aux = aux.next;
        }
        return elements;
    }
}

