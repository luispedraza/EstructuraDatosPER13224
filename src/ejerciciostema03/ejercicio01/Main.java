package ejerciciostema03.ejercicio01;

/**
 * Clase para hacer pruebas del ejercicio 1
 * Se implementa el método size()
 */
public class Main {
    public static void main(String[] args) {
        StringList list = new StringList();
        System.out.println("la lista tiene " + list.size() + " elementos");
        list.add("uno");
        list.add("dos");
        list.add("tres");
        System.out.println("la lista tiene " + list.size() + " elementos");
        list.delete(1);
        System.out.println("la lista tiene " + list.size() + " elementos");
    }
}
