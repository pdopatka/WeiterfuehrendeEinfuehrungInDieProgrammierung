package Homework_3_OOP.Task_2;

public class Mail extends Message {
    @Override
    public String getType() {
        return "Email";
    }

    public void send() {
        System.out.println("E-Mail sent");
    }
}