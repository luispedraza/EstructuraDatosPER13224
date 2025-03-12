package tema01a;

public class Persona {
    int edad;
    String nombre;
    double altura;

    public Persona() {
        edad = 23;
        nombre = "Pedro";
        altura = 1.23;
    }

    public Persona(int edad, String nombre, double altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
    }

    void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }



}
