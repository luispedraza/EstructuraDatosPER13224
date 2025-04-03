package tema03;

/**
 * Implementación de una lista simplemente enlazada
 * Cada uno de los elementos es de la clase Nodo del mismo paquete.
 */
public class ListaSE {
    Nodo first;
    Nodo last;
    // int numElement;

    /**
     * Constructor de la lista
     * Inicializa las referencias first y last con el valor null.
     */
    public ListaSE() {
        this.first = null;
        this.last = null;
    }

    /**
     * Método que implementa la opración del TAD Añadir
     * @param valor: dato que queremos insertar en la lista
     */
    public void add (String valor) {
        // Creamos el nuevo nodo:
        Nodo nuevo = new Nodo(valor);
        // Comprobamos si la lista está vacía
        if (first == null) {
            first = last = nuevo;
        } else {
            last.next = nuevo;
            last = nuevo;
        }
    }




    @Override
    public String toString() {
        // Mostrar como texto el contenido de la Lista.
        StringBuilder builder = new StringBuilder();
        if (first == null) return "La lista está vacía";

        Nodo aux = first;   // Obtenemos el nodo en la cabeza
        while (aux != null) {
            builder.append(aux.dato);
            builder.append(" ");
            aux = aux.next;
        }
        return builder.toString();
    }
}
