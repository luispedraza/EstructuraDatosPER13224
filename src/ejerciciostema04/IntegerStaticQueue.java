package ejerciciostema04;

/**
 * Clase que implementa una cola estática de valores tipo Integer
 * Utiliza como estructura para almacenar los datos un vector de tipo Integer
 */
public class IntegerStaticQueue {

    Integer[] elements;     // Vector que contiene los datos de la cola
    int count;              // Número de elementos que en un momento dado almacena la cola
    int size;               // Tamaño de la cola estática (máximo número de elementos que puede almacenar)
    int head;               // Índice del primer elemento de la cola (elemento más antiguo)
    int tail;               // Índice del último elemento (tail) de la cola.

    /**
     * Constructor de la clase
     *
     * @param size tamaño del vector, capacidad máxima de la cola
     */
    public IntegerStaticQueue(int size) {
        elements = new Integer[size];       // creación del vector para almacenar los datos
        this.size = size;                   // guardamos el tamaño la cola
        count = 0;                          // inicialment no hay ningún valor almacenado
        head = 0;
        tail = -1;
    }

    /**
     * Añade elementos a la cola. Si la cola está llena devuelve false
     *
     * @param item valor que queremos agregar a la cola
     * @return true si se agrega el valor, false si la cola está llena
     */
    public boolean enqueue(Integer item) {
        if (count == size) {
            // la cola está llena
            return false;
        }
        tail = (tail + 1) % size;
        elements[tail] = item;  // Insertando el valor en la cola
        count++;
        return true;    // Hemos podido insertar el valor.
    }

    /**
     * OPeración desencolar
     *
     * @return primer elemento de la cola (en head) o null si la cola está vacía
     */
    public Integer dequeue() {
        if (count == 0) {
            // No hay elementos en la cola
            return null;
        }
        Integer value = elements[head];    // guardamos el valor que devolveremos
        head = (head + 1) % size;
        count--;
        return value;
    }

    /**
     * Devuelve el elemento en la cabecera de la cola sin extraerlo
     *
     * @return primer elemento, null si la cola está vacía
     */
    public Integer first() {
        return (count == 0) ? null : elements[head];
    }

    /**
     * Indica si la cola está vacía
     *
     * @return true si está vacía, false en caso contrario
     */
    public boolean isEmpty() {
        return (count == 0);
    }


    @Override
    public String toString() {
        if (count == 0) return "Cola vacía";
        StringBuilder sb = new StringBuilder();
        for (int i = head; i < head + count; i++) {
            int index = (i >= size) ? i % count : i;
            Integer value = elements[index];
            sb.append(value).append(" ");

        }
        return sb.toString();
    }
}
