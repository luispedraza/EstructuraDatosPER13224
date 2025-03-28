package ejerciciostema03.ejercicio6;

/**
 * El nodo de la lista de tickets
 */
public class TicketNode {
    Ticket ticket;
    TicketNode next;

    public TicketNode(Ticket ticket) {
        this.ticket = ticket;
        this.next = null;
    }
}
