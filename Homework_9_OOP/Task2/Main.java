package Homework_9_OOP.Task2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 2, "Physics");
        Student s2 = new Student("Bob", 3, "Mathematics");

        StudentFormatter fmt1 = (s) -> "Student " + s.getName() + ", Year " + s.getYear();
        StudentFormatter fmt2 = (s) -> s.getName() + " studies " + s.getMajor() + " in Year " + s.getYear();

        System.out.println(fmt1.format(s1));
        System.out.println(fmt1.format(s2));
        System.out.println(fmt2.format(s1));
        System.out.println(fmt2.format(s2));
    }
}
