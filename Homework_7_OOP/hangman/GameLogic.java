package Homework_7_OOP.hangman;

public interface GameLogic {
    void handleGuess(char guess);
    boolean hasWon();
    void endGame(boolean won);
}