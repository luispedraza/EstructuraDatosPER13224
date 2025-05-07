package tema07;

public class Main {

    public static void main(String[] args) {
        ColaDePrioridad cola = new ColaDePrioridad();
        // Imprime el contenido de la cola de prioridad (montículo)
        // antes de agregar elementos
        System.out.println("Contenido de la cola: " + cola);
        // Inserto elementos en la cola de prioridad
        cola.insertar("Alberto", 5);
        cola.insertar("Ana", 4);
        cola.insertar("Carlos", 10);
        cola.insertar("Teresa", 2);
        cola.insertar("María", 3);
        cola.insertar("Andrés", 1);
        cola.insertar("Aitana", 3);
        // Imprime el contenido de la cola de prioridad (montículo)
        System.out.println("Contenido de la cola: " + cola);
        // Desencola elementos de cola de prioridad
        Nodo nodoDesencolado1 = cola.desencolar();
        System.out.println("nodoDesencolado1 = " + nodoDesencolado1);
        Nodo nodoDesencolado2 = cola.desencolar();
        System.out.println("nodoDesencolado2 = " + nodoDesencolado2);
        Nodo nodoDesencolado3 = cola.desencolar();
        System.out.println("nodoDesencolado3 = " + nodoDesencolado3);
        Nodo nodoDesencolado4 = cola.desencolar();
        System.out.println("nodoDesencolado4 = " + nodoDesencolado4);
        Nodo nodoDesencolado5 = cola.desencolar();
        System.out.println("nodoDesencolado5 = " + nodoDesencolado5);
        // Imprime el contenido de la cola de prioridad (montículo)
        // después de desencolar sus elementos
        System.out.println("Contenido de la cola: " + cola);
    }
}