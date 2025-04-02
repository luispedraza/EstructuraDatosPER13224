package tema04;

import java.util.Arrays;

/**
 * Clase que implementad un TAD pila estática
 * Pila de valores de tipo int
 */
public class StatickStack {
    int size;               // tamaño o capacidad de la pila
    private int[] stack;    // contendrá los elementos de la pila
    int top;                // almacena la posición de la cima


    public StatickStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;      // la pila está vacía
    }

    /**
     * Operación Apilar(elemento)
     * Incluye un nuvo elemento en la cima de la pila
     * @param value: valor que queremos añadir a la pila
     * @return: true si se puede añadir, false si la pila ya está llena
     */
    public boolean push (int value) {
        // Comprobar si hemos alcanzado la capacidad máxima de la pila
        // Eso sería cuando la cina esté en el último elemento del array de soporte
        if (top == size-1) return false;
        top++;
        stack[top] = value;
        return true;
    }

    /**
     * Operación Cima()
     * @return: elemento en la cima de la pila sin eliminarlo
     */
    public int peek() throws Exception {
        if (isEmpty()) {
            // la pila está vacía, no hay ningún elemento en la cima
            throw new Exception("Se ha intentado consultar la cima de una pila vacía\n");
        } else {
            return stack[top];
        }
    }

    /**
     * Operación Desapilar()
     * @return: devuelve el elemento en la cima de la pila, que queda despilado
     */
    public int pop() throws Exception {
        if (isEmpty()) {
            // la pila está vacía, no se pueden desapilar elementos
            throw new Exception("Se ha intentado desapilar en una pila que está vacía");
        }
        int aux = stack[top];
        top--;
        return aux;
    }

    @Override
    public String toString() {
        return "StatickStack{" +
                "size=" + size +
                ", stack=" + Arrays.toString(stack) +
                ", top=" + top +
                '}';
    }

    /**
     * OPeración Vacía()
     * @return: true si la pila está vacía
     */
    public boolean isEmpty() {
        return top < 0;
    }

    /**
     * OPeración Llena()
     * @return: true si la pila está llena
     */
    public boolean isFull() {
        return top == size-1;
    }

    /**
     * Operación Limpiar()
     * Vacía la pila de contenido
     */
    public void clear() {
        top = -1;
    }

    public static void main(String[] args) {
        StatickStack pilaEstatica = new StatickStack(10);
        int valorExtraido;
        try {
            // System.out.println("Elemento en la cima : " + pilaEstatica.peek());
            pilaEstatica.push(0);
            System.out.println(pilaEstatica);
            pilaEstatica.push(1);
            System.out.println(pilaEstatica);
            pilaEstatica.push(2);
            System.out.println(pilaEstatica);
            pilaEstatica.push(3);
            System.out.println(pilaEstatica);
            pilaEstatica.push(4);
            System.out.println(pilaEstatica);
            pilaEstatica.push(5);
            System.out.println(pilaEstatica);
            pilaEstatica.push(6);
            System.out.println(pilaEstatica);
            pilaEstatica.push(7);
            System.out.println(pilaEstatica);
            pilaEstatica.push(8);
            System.out.println(pilaEstatica);
            pilaEstatica.push(9);
            System.out.println(pilaEstatica);


            System.out.println("Elemento en la cima : " + pilaEstatica.peek());
            valorExtraido = pilaEstatica.pop();
            valorExtraido = pilaEstatica.pop();
            valorExtraido = pilaEstatica.pop();
            valorExtraido = pilaEstatica.pop();
            valorExtraido = pilaEstatica.pop();
            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();
//            valorExtraido = pilaEstatica.pop();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
