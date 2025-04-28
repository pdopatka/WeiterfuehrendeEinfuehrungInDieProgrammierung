package Homework_3_OOP.Task_1.testpackage;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;
    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }
    public double getBalance() {
        return balance;
    }
    public void changePin(int newPin, int oldPin) {
        if (oldPin != this.pin) {
            System.out.println("Old pin is incorrect. Cannot change pin.");
            return;
        }
        this.pin = newPin;
    }
}
