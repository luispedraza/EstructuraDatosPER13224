package tema07;

/**
 * Elemento nodo de la cola de prioridad (montículo)
 */
public class Nodo {
    public String valor;    // Valor almacenado, en este caso de tipo String
    public int prioridad;   // Prioridad del elemento

    /**
     * Constructor del nodo
     * @param valor
     * @param valorPrioridad
     */
    public Nodo(String valor, int valorPrioridad) {
        this.valor = valor;
        this.prioridad = valorPrioridad;
    }

    /**
     * Representación de nodo en formato string
     * @return representación String
     */
    public String toString() {
        return "(" + valor + ", " + prioridad + ")";
    }
}
