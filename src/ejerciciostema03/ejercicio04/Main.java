package ejerciciostema03.ejercicio04;

/**
 * Clase para hacer pruebas del ejercicio 1
 * Se implementa el método toArrayList()
 */
public class Main {
    public static void main(String[] args) {
        StringList list = new StringList();
        System.out.println(list);
        System.out.println("la lista tiene " + list.size() + " elementos");
        System.out.println("Primer elemento: " + list.getFirst());
        System.out.println("Como ArrayList: " + list.toArrayList());

        list.add("uno");
        list.add("dos");
        list.add("tres");
        System.out.println(list);
        System.out.println("la lista tiene " + list.size() + " elementos");
        System.out.println("Primer elemento: " + list.getFirst());
        System.out.println("Como ArrayList: " + list.toArrayList());

        list.delete(1);
        System.out.println(list);
        System.out.println("la lista tiene " + list.size() + " elementos");
        System.out.println("Primer elemento: " + list.getFirst());
        System.out.println("Como ArrayList: " + list.toArrayList());

    }
}
