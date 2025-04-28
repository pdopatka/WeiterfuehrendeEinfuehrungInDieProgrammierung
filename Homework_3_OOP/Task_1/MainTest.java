package Homework_3_OOP.Task_1;

import Homework_3_OOP.Task_1.auditpackage.ExternalAudit;
import Homework_3_OOP.Task_1.companypackage.CompanyAccount;
import Homework_3_OOP.Task_1.testpackage.AccountManager;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Testing AccountManager:");
        AccountManager accountManager = new AccountManager();
        accountManager.testAccess();

        System.out.println("\nTesting ExternalAudit:");
        ExternalAudit externalAudit = new ExternalAudit();
        externalAudit.testAccess();

        System.out.println("\nTesting CompanyAccount:");
        CompanyAccount companyAccount = new CompanyAccount("Charlie", 3000.0, 9876, "Company Note");
        companyAccount.testAccess();
    }
}