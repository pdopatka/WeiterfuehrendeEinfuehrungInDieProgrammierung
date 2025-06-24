package Praezenz6.Task1;

public class BankAccount {
private int balance;
public BankAccount (int initialBalance ) {
this.balance = initialBalance ;
}
public void deposit(int i){
    this.balance += i;
}
public void withdraw(int i){
    this.balance -= i;
}
public int getBalance () {
return balance;
}
}