package tema03;

/**
 * Clase para probar mi ListaBorrado y sus métodos
 */
public class MainListaBorrado {

    static void probarDeleteFirst() {
        // Creamos la lista
        ListaBorrado lista = new ListaBorrado();
        System.out.println(lista);
        // Agregar elementos
        lista.add("Pepe");
        lista.add("María");
        System.out.println(lista);
        System.out.println("Procedemos a borrar elementos:");
        lista.deleteFirst();
        System.out.println(lista);
        lista.deleteFirst();
        System.out.println(lista);
        lista.deleteFirst();
        System.out.println(lista);
    }

    static void probarDeleteFirstAlternative() {
        // Creamos la lista
        ListaBorrado lista = new ListaBorrado();
        System.out.println(lista);
        // Agregar elementos
        lista.add("Pepe");
        lista.add("María");
        System.out.println(lista);
        System.out.println("Procedemos a borrar elementos:");
        lista.deleteFirstAlternative();
        System.out.println(lista);
        lista.deleteFirstAlternative();
        System.out.println(lista);
        lista.deleteFirstAlternative();
        System.out.println(lista);
    }

    static void probarDeleteLast() {
        // Creamos la lista
        ListaBorrado lista = new ListaBorrado();
        System.out.println(lista);
        // Agregar elementos
        lista.add("Pepe");
        lista.add("María");
        lista.add("Jaime");
        System.out.println(lista);
        System.out.println("Procedemos a borrar elementos:");
        lista.deleteLast();
        System.out.println(lista);
        lista.deleteLast();
        System.out.println(lista);
        lista.deleteLast();
        System.out.println(lista);
    }

    public static void main(String[] args) {
        // probarDeleteFirst();
        // probarDeleteFirstAlternative();
        probarDeleteLast();
    }
}
