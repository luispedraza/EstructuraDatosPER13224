package ejerciciostema01.ejercicio04;

/**
 * Programar la clase <i>Account</i> que representa la entidad “cuenta bancaria” con atributos para el nombre y apellido
 * del titular, número de cuenta y saldo. En cuanto a los métodos, debe tener un constructor con tantos parámetros
 * como atributos tiene la clase, métodos para obtener y establecer valores de los atributos, un método para
 * depositar dinero y otro para retirarlo, <b>teniendo en cuenta que no se puede retirar más de lo que hay en la cuenta</b>.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        // Nota: para las pruebas podemos usar este generador cuentas:
        // https://generador-de-dni.es/bancos/
        Account account = new Account("Elena", "Ochoa", "ES84 2016 8134 2952 5701 6231");
        System.out.println(account);
        account.deposit(500);
        System.out.println(account);
        account.withdraw(200);
        System.out.println(account);

    }
}
