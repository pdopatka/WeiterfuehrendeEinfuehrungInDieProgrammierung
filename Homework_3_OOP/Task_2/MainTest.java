package Homework_3_OOP.Task_2;

public class MainTest {
    public static void main(String[] args) {
        Message m1 = new Mail();
        Message m2 = new SMS();

        System.out.println(m1.getType());
        System.out.println(m2.getType()); 

        if (m1 instanceof Mail) {
            ((Mail) m1).send();
        }
    }
}