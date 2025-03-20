package ejerciciostema01.ejercicio05;

// ¡Ojo!, he importado una clase de un paquete diferente

import ejerciciostema01.ejercicio04.Account;

/**
 * Con el objetivo de realizar pruebas, es posible crear dentro de una clase el método main.
 * Completar la clase Account implementada en el ejercicio anterior con un método main que cree una cuenta,
 * deposite 1300 euros en ella, y realice 3 retiradas de 500 euros.
 * Se espera que las dos primeras retiradas terminen con éxito, pero la última no.
 * Mostrar mensajes por consola que indiquen la evolución de la cuenta.
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Account account;
        account = new Account("Juan", "Cortés", "ES81 3098 1705 6717 5775 2744", 1300);
        System.out.println("El saldo de la cuenta es: " + account.getBalance());

        for (int i = 0; i < 3; i++) {
            System.out.println("Retirada " + (i + 1));
            if (account.withdraw(500))
                System.out.println("La retirada se ha realizado con éxito");
            else
                System.out.println("La retirada no se ha podido realizar");
            System.out.println("El saldo de la cuenta es: " + account.getBalance());
        }

    }
}
