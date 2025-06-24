package Homework_9_OOP.Task1;

public class Main {
    public static void main(String[] args) {
        for (CursePhase phase : CursePhase.values()) {
            System.out.println(phase + ": " + phase.getMessage());
        }
    }
}
