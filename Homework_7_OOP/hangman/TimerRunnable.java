package Homework_7_OOP.hangman;

import javax.swing.SwingUtilities;

public class TimerRunnable implements Runnable {
    private final HangmanGame game;

    public TimerRunnable(HangmanGame game) {
        this.game = game;
    }

    @Override
        public void run() {
            SwingUtilities.invokeLater(() -> game.updateDisplay());
            while (game.timerRunning && game.timeLeft > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Thread wurde unterbrochen, sauber beenden
                    return;
                }
                game.timeLeft--;
                SwingUtilities.invokeLater(() -> game.updateDisplay());
                if (game.timeLeft == 0) {
                    game.timerRunning = false;
                    SwingUtilities.invokeLater(() -> game.endGame(false));
                }
            }
        }
}
