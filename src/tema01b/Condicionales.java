package tema01b;

public class Condicionales {

    public static void main(String[] args) {
        // EXPLICAR LA DEPURACIÓN DEL CÓDIGO
        int n1 = 20;
        int n2 = 26;

        // if
        if (n1 > n2) {
            System.out.println("n1 es mayor que n2");
        } else if (n2 > n1) {
            System.out.println("n2 es mayor que n1");
        } else {
            System.out.println("n1 y n2 son iguales");
        }

        // operadores lógicos
        n1 = 2;
        n2 = 2;
        if ((n1 == 1) && (n2 == 2)) {
            System.out.println("n1 es 1 y n2 es 2");
        }
        if ((n1 == 1) || (n2 == 1)) {
            System.out.println("n1 es 1 o n2 es 1");
        }
    }
}
