package ejerciciostema03.ejercicio03;

/**
 * Clase para hacer pruebas del ejercicio 1
 * Se implementa el método getFirst()
 */
public class Main {
    public static void main(String[] args) {
        StringList list = new StringList();
        System.out.println(list);
        System.out.println("la lista tiene " + list.size() + " elementos");
        System.out.println("Primer elemento: " + list.getFirst());
        list.add("uno");
        list.add("dos");
        list.add("tres");
        System.out.println(list);
        System.out.println("la lista tiene " + list.size() + " elementos");
        System.out.println("Primer elemento: " + list.getFirst());
        list.delete(1);
        System.out.println(list);
        System.out.println("la lista tiene " + list.size() + " elementos");
        System.out.println("Primer elemento: " + list.getFirst());
    }
}
