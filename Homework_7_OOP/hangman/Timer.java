package Homework_7_OOP.hangman;

public class Timer extends Game {
    protected Thread timerThread;
    protected boolean timerRunning;
    protected int timeLeft;
    protected static final int TIME_LIMIT = 60;

    @Override
    public void startGame() {
        super.startGame();
        startTimer();
    }
    public void startTimer() {
        if (timerRunning) {
            stopTimer();
        }
        this.timeLeft = TIME_LIMIT;
        timerRunning = true;
        //timerThread = new Thread(new TimerRunnable(this)); (Auskommentiert da TimerRunnable gerade ein Objekt des typsHangmanGame erwartet)
        timerThread.start();
    }
    public void stopTimer() {
        timerRunning = false;
        if (timerThread != null) {
            timerThread.interrupt();
        }
    }
    @Override
    public void updateDisplay() {
        super.updateDisplay();
        timeLabel.setText(" Time left: " + this.timeLeft);
    }
    @Override
    public void endGame(boolean won) {
        super.endGame(won);
        stopTimer();
    }
}
