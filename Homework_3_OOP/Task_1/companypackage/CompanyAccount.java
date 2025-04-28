package Homework_3_OOP.Task_1.companypackage;

import Homework_3_OOP.Task_1.testpackage.Account;

public class CompanyAccount extends Account {
    public CompanyAccount(String owner, double balance, int pin, String internalNote) {
        super(owner, balance, pin, internalNote);
    }

    public void testAccess() {
        System.out.println("Owner: " + owner); // Accessible (public)
        // System.out.println("Balance: " + balance); // Not accessible (private)
        // System.out.println("Internal Note: " + internalNote); // Not accessible (package-private, different package)
        System.out.println("PIN: " + pin); // Accessible (protected, subclass)
    }
}