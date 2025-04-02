/**
 * Implementación de una cola estática
 * Es fácil a partir de la implementación de la pila estática
 * El método que más cambia es dequeue si la cabeza está al comienzo.
 * El método que más cambia es enqueue si el final está al comienzo del array
 */
public class StaticQueue {
    private int size;       // Tamaño máximo de la cola
    private int queue[];    // Estructura de datos auxiliar
    private int tail;       // Posición del final de la cola

    /**
     * Operación Inicializar(tamaño)
     * Al ser una cola estática la podemos crear con el tamaño asignado
     * @param size: tamaño de la cola
     */
    public StaticQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.tail = -1;      // La cola vacía no tiene posición de elemento final
    }

    /**
     * Operación Encolar(elemento)
     *
     * @return: false si no se pude encolar (límite alcanzado), true en caso contrario
     */
    public boolean enqueue(int value) {
        // Comprobamos la capacidad de la cola
        if (tail < size - 1) {
            tail++;
            queue[tail] = value;
            return true;
        }
        return false;
    }

    /**
     * Operación Desencolar()
     * @return: el elemento en la cabeza de la cola, que queda desencolado
     * La cabeza está siempre en el elemento 0
     * Es necesario mover una posición a la izquierda todos los elementos a continuación
     */
    public int dequeue() throws Exception {
        int data;   // Variable auxiliar para devolver el elemento en la cabeza
        if (tail < 0) {
            throw new Exception("Se intentó desencolar un elemento de una cola vacía");
        } else {
            data = queue[0];
            for (int i = 0; i < tail; i++) {
                // Desplazamos todos los elementos de la cola hacia la cabeza:
                queue[i] = queue[i+1];
            }
            tail--;
            return data;
        }
    }

    /**
     * Operación Primero()
     * @return: el elemento en la cabeza de la cola
     */
    public int first() throws Exception {
        if (tail < 0) {
            // Si la cola está vacía no tiene sentido consultar su primer elemento.
            // En este caso no podemos devolver false o null para informar del error
            // Lo gestionamos a través de una excepción
            throw new Exception("Se intentó consultar el comienzo de una cola vacía");
        } else {
            return queue[0];
        }
    }

    /**
     * Operación Vacía()
     * @return: true si la cola está vacía
     */
    public boolean isEmpty() {
        return tail < 0;
    }

    /**
     * Operación Llena()
     * @return: true si la pila está llena
     */
    public boolean isFull() {
        return tail == size-1;
    }

    /**
     * Operación Limpiar()
     * Vacía la cola de contenido
     */
    public void clear() {
        tail = -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(
                String.format("Cola de capacidad %d, con %d elementos:\n",
                        size, tail + 1)
        );
        for (int i = 0; i <= tail; i++) {
            sb.append(queue[i] + " <- ");
        }
        sb.append("\ncabeza <--------------------------- cola");
        return sb.toString();
    }

}