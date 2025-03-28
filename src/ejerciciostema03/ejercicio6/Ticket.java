package ejerciciostema03.ejercicio6;

/**
 * La inforamción de un ticket
 */
public class Ticket {
    String info;
    boolean urgent;

    public Ticket(String info, boolean urgent) {
        this.info = info;
        this.urgent = urgent;
    }

    @Override
    public String toString() {
        return info;
    }
}
