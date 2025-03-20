package ejerciciostema01.ejercicio04;

public class Account {
    // Atributos privados
    private String firstName;   // Nombre del titular
    private String lastName;    // Apellido del titular
    private String id;          // Número de cuenta
    private double balance;     // Saldo actual de la cuenta


    /**
     * Constructor:
     * @param firstName: Nombre del titular
     * @param lastName: Apellido del titular
     * @param id: Número de cuenta, identificador
     * @param balance: Saldo inicial de la cuenta
     */
    public Account(String firstName, String lastName, String id, double balance) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = balance;
    }

    /**
     * Dado que generalmente el saldo inicial es cero, podemos tener este otro constructor:
     * @param firstName: NOmbre del titular
     * @param lastName: Apellido del titular
     * @param id: Número de cuenta, identificador
     */
    public Account(String firstName, String lastName, String id) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.id = id;
//        this.balance = 0;
        // O podemos hacer lo mismo reutilizando el constructor anterior:
        this(firstName, lastName, id, 0);
    }

    // Setters y getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Métodos para depositar o retirar dinero de la cuenta.
    public void deposit(double money) {
        if (money > 0)
            this.balance = this.balance + money;
    }

    public boolean withdraw(double money) {
        if (money > this.balance)
            return false;
        this.balance = this.balance - money;
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
