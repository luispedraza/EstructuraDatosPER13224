package tema01b;
public class Persona {

    // Atributos de la clase
    private int edad;
    private String nombre;
    private double altura;

    // Constructores de la clase
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

    // Métodos de la clase
    void saludar() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }


    // Getters y setters


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}