
    package Homework_3_OOP.Task_1.testpackage;

public class AccountManager {
    public void testAccess() {
        Account account = new Account("Alice", 1000.0, 1234, "Internal Note");

        // Accessing attributes
        System.out.println("Owner: " + account.owner); // Accessible (public)
        // System.out.println("Balance: " + account.balance); // Not accessible (private)
        System.out.println("Internal Note: " + account.internalNote); // Accessible (package-private)
        // System.out.println("PIN: " + account.pin); // Accessible (protected, but only within the same package)
    }
}
