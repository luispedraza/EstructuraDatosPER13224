package tema04;

class Hola {
    int a;
    int b;

    public Hola(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class ComprobacionEnteros {



    public static void main(String[] args) {
        Integer a = 4;
        Integer b = 4;
        boolean iguales = (a.equals(b));
        System.out.println(iguales);

        //
        Hola holaA = new Hola(1, 2);
        Hola holaB = new Hola(1, 2);
        iguales = (holaA == holaB); // estamos comparando el valor de las referencias no el de los atributos
        System.out.println(iguales);

    }
}
