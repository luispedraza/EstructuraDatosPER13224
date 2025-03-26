package tema03;

/**
 * Clase que define cada uno de los nodos de una lista
 */
public class Nodo {

    String dato; // Información que contiene el nodo
    Nodo next;     // referencia al siguiente nodo en lista simplemente enlazada

    /**
     * Este es un constructor de la clase
     * @param dato: información que almacena el nodo
     */
    public Nodo(String dato) {
        this.dato = dato;
        this.next = null;
    }
}
