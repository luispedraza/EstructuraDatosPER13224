package ejerciciostema03.ejercicio6;

public class TicketsList {
    TicketNode first;
    TicketNode last;
    int numElems = 0;

    /**
     * Constructor: crea una lista vacía
     */
    public TicketsList() {
        this.first = null;
        this.last = null;
    }

    /**
     * Operación que añade un ticket al final de la lista
     * @param ticket
     */
    private void addLast(Ticket ticket) {
        TicketNode node = new TicketNode(ticket);  // Crear el nuevo nodo
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
     * Operación que añade un ticket al comienzo de la lista
     * @param ticket
     */
    private void addFirst(Ticket ticket) {
        TicketNode node = new TicketNode(ticket);  // Crear el nuevo nodo
        if (first == null) {
            // la lista está vacía
            first = node;
            last = node;
        } else {
            // la lista NO está vacía
            node.next = first;
            first = node;
        }
        numElems++;         // Se incrementa el contado de elementos de la lista
    }

    /**
     * Método que añade el ticket a la lista, previa comprobación de su urgencia
     * @param ticket: ticket recibido
     */
    public void add(Ticket ticket) {
        if (ticket.urgent) addFirst(ticket);
        else addLast(ticket);
    }

    /**
     * Operación que obtiene el primer ticket de la lista
     * @return
     */
    public Ticket get() {
        // Si la lista está vacía:
        if (first == null) return null;
        // En caso de que haya al menos un elemento:
        TicketNode node = first;
        first = first.next;
        return node.ticket;
    }

    @Override
    public String toString() {
        TicketNode aux = first;
        StringBuilder sb = new StringBuilder();
        while (aux != null) {
            sb.append(aux.ticket.info + "\n");
            aux = aux.next;
        }
        return sb.toString();
    }
}
