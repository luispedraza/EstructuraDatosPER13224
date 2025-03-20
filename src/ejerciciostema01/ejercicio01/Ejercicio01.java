package ejerciciostema01.ejercicio01;


/**
 * <b>Planteamiento</b>
 * <p>
 * Programar la clase Student con atributos para el nombre y apellido del alumno, su edad, y su nota media.
 * En cuanto a los métodos, debe tener un constructor con tantos parámetros como atributos tiene la clase,
 * métodos para obtener y establecer valores de los atributos y un método para determinar si el estudiante
 * ha aprobado o no (se considera aprobado su nota media es mayor o igual que 5).
 * </p>
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        // Podemos probar la clase:
        Student student1 = new Student("Elena", "Romero", 23, 6);
        Student student2 = new Student("Jaime", "Ortega", 22, 4);
        student1.passedInfo();
        student2.passedInfo();
        student1.setAverageGrade(3);
        student2.setAverageGrade(8);
        student1.passedInfo();
        student2.passedInfo();
    }
}
