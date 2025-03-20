package tema02;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void ladrar() {
        System.out.println(name + ": Guau!");
    }

    public static void main(String[] args) {
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog("Toby");
        myDogs[1] = new Dog("Miki");
        myDogs[2] = new Dog("Karl");

        for (Dog dog : myDogs) {
            dog.ladrar();
        }
        // No se copia el valor, se copia la referencia al objeto
        myDogs[0] = myDogs[1] = myDogs[2];
        myDogs[0].setName("Lassie");
        for (Dog dog : myDogs) {
            dog.ladrar();
        }
    }
}
