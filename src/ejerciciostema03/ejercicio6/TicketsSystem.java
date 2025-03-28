package ejerciciostema03.ejercicio6;

/**
 * Clase para probar las clases TicketLinkedList y TicketArrayList
 */
public class TicketsSystem {

    public static void main(String[] args) {
        TicketsList tickets = new TicketsList();

        // Agregar tickets al final de la lista
        tickets.add(new Ticket("Ticket 1 - Problema de servidor de correo", false)); // Ticket no urgente
        tickets.add(new Ticket("Ticket 2 - Error de conexión", false)); // Ticket no urgente
        tickets.add(new Ticket("Ticket 3 - Problema de acceso al sitema", false)); // Ticket no urgente

        // Imprimir los tickets en el orden de llegada
        System.out.println("Tickets en orden de llegada:");
        System.out.println(tickets);

        // Agregar un ticket urgente al principio de la lista
        tickets.add(new Ticket("Ticket Urgente - Servidor de correo inoperativo", true));

        // Imprimir los tickets actualizados
        System.out.println("\nTickets actualizados:");
        System.out.println(tickets);

        // Procesar (eliminar) el ticket situado al principio de la lista
        Ticket ticketProcesado = tickets.get();
        System.out.println("\nProcesando el primer ticket: " + ticketProcesado);
    }

}

