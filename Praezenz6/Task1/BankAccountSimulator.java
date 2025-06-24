package Praezenz6.Task1;

public class BankAccountSimulator {
public static void main(String [] args) {
BankAccount account = new BankAccount (1000);
// TODO: Create and start two threads that each perform:
// - 1000 deposits of 1
// - 1000 withdrawals of 1
// TODO: Wait for threads to finish using join ()
TransactionThread thread1 = new TransactionThread(account);
TransactionThread thread2 = new TransactionThread(account);
thread1.start();
thread2.start();
System.out.println (" Final balance: " + account. getBalance ());
}
}