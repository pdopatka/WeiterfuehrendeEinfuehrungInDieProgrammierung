package Homework_3_OOP.Task_1.auditpackage;

import Homework_3_OOP.Task_1.testpackage.Account;

public class ExternalAudit {
    public void testAccess() {
        Account account = new Account("Bob", 2000.0, 5678, "Audit Note");

        // Accessing attributes
        System.out.println("Owner: " + account.owner); // Accessible (public)
        // System.out.println("Balance: " + account.balance); // Not accessible (private)
        // System.out.println("Internal Note: " + account.internalNote); // Not accessible (package-private)
        // System.out.println("PIN: " + account.pin); // Not accessible (protected, different package and not a subclass)
    }
}