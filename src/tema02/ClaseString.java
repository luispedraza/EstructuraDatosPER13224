package tema02;

public class ClaseString {

    public static void main(String[] args) {
        String nombre = "Pedro";
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(
                    String.format("Caracter en la posicion %d: %c",
                            i, nombre.charAt(i))
            );
        }
    }
}
