package tema01a;

public class MisPersonas {


    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.saludar();

        Persona persona2 = new Persona(10, "Jaime", 1.10);
        persona2.saludar();
    }
}
