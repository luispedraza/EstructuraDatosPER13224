package ejerciciostema03.ejercicio02;

/**
 * Este es el código de partida para los ejercicios 1 a 4
 * Clase Node
 */
class Node {
    String data;
    Node next;

    Node(String str) {
        data = str;
        next = null;
    }

    public String toString() {
        return data;
    }
}
