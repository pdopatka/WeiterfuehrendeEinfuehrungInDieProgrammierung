package Homework_7_OOP.hangman;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HangmanGame();
        });
    }
}
