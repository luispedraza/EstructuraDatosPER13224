package ejerciciostema03.ejercicio05;

import java.util.LinkedList;

/**
 * Clase que implementa el programa solicitado con la salida en pantalla requerida
 */
public class TicketsSystem {

    public static void main(String[] args) {
        LinkedList<String> tickets = new LinkedList<>();

        // Agregar tickets al final de la lista
        tickets.addLast("Ticket 1 - Problema de servidor de correo");
        tickets.addLast("Ticket 2 - Error de conexión");
        tickets.addLast("Ticket 3 - Problema de acceso al sitema");

        // Imprimir los tickets en el orden de llegada
        System.out.println("Tickets en orden de llegada:");
        for (String ticket : tickets) {
            System.out.println(ticket);
        }

        // Agregar un ticket urgente al principio de la lista
        tickets.addFirst("Ticket Urgente - Servidor de correo inoperativo");

        // Imprimir los tickets actualizados
        System.out.println("\nTickets actualizados:");
        for (String ticket : tickets) {
            System.out.println(ticket);
        }

        // Procesar (eliminar) el ticket situado al principio de la lista
        String ticketProcesado = tickets.removeFirst();
        System.out.println("\nProcesando el primer ticket: " + ticketProcesado);
    }

}

