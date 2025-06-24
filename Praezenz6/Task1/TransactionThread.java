package Praezenz6.Task1;

public class TransactionThread extends Thread {
    private BankAccount bankAccount;
    public TransactionThread(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            bankAccount.deposit(1);
        }
        for (int i = 0; i < 1000; i++) {
            bankAccount.withdraw(1);
        }
        bankAccount.getBalance();
    }
}
