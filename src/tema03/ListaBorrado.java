package tema03;

/**
 * Clas que implemente el TAD lista con operaciones de borrado
 */
public class ListaBorrado extends ListaSE {
    /**
     * Método que borra el primer elemento de la lista
     * (elemento en la cabeza de la lista)
     */
    void deleteFirst() {
        // Comprobar que la lista no está vacía:
        if (first != null) {
            first = first.next;
            // Comprobar si la lista ha quedado vacía.
            if (first == null) {
                // la lista está vacía y tnego que actualizar la referencia de la cola:
                last = null;
            }
        }
    }

    /**
     * Implementación alternativa de la operación BorrarPrimerElemento
     */
    void deleteFirstAlternative() {
        if (first == null) return; // la lista está vacía, nada que hacer
        if (first == last) {
            // lista con un elemento
            first = last = null;
        } else {
            // la lista tiene al menos dos elementos
            first = first.next;
        }
    }

    /**
     * Método que borra el último elemento de la lista
     * (elemento en la cola de la lista)
     */
    void deleteLast() {
        Nodo aux;   // variable auxiliar para recorrer la lista hasta el penúltimo nodo
        if (first == null) return; // la lista está vacía, nada que borrar
        if (first == last) {
            // la lista tiene un solo elemento
            first = last = null;
        } else {
            // la lista tiene al menos dos elementos
            aux = first;
            while (aux.next.next != null) aux = aux.next;
            // En este punto aux referencia al penúltimo elemento de la lista
            // Desconectamos el último elemenot:
            aux.next = null;
            last = aux;
        }
    }
}
