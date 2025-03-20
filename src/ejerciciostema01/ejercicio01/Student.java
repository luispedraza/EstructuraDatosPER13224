package ejerciciostema01.ejercicio01;

class Student {
    // definimos los atributos, privados:
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;

    // Constructor para incializar los 4 atributos:
    public Student(String firstName, String lastName, int age, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    // Getters y setters:

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Método que comprueba si el estudiante ha aprobado:
    public boolean passed() {
        return this.averageGrade >= 5;
    }

    // Una implementación alternativa, que muestra información en pantalla:
    public boolean passedInfo() {
        if (this.averageGrade >= 5) {
            System.out.println(this.firstName + " " + this.lastName + " ha aprobado");
            return true;
        } else {
            System.out.println(this.firstName + " " + this.lastName + " ha suspendido");
            return false;
        }
    }
}
