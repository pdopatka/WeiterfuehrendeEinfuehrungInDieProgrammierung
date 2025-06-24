package Homework_7_OOP.hangman;

public class HangmanGame extends GameGUI implements GameLogic, TimerLogic {
    protected Thread timerThread;
    protected boolean timerRunning;

    public HangmanGame() {
        super();
    }

    public void handleGuess(char guess) {
        if (guessedLetters.contains(guess)) {
            System.out.println("You have already guessed that letter.");
            attemptsLeft--;
            return;
        } else if (currentWord.indexOf(guess) == -1) {
            System.out.println("Incorrect guess.");
            attemptsLeft--;
        } else {
            System.out.println("Good guess!");
            guessedLetters.add(guess);
        }
        updateDisplay();
        if (attemptsLeft <= 0 || this.hasWon()) {
            endGame(this.hasWon());
        }
    }

    @Override
    public boolean hasWon() {
        final String originalWord = currentWord;
        for (char letter : currentWord.toCharArray()) {
            if (guessedLetters.contains(letter)) {
                currentWord = currentWord.replace(String.valueOf(letter), "");
            }
        }
        if (currentWord.isEmpty()) {
            currentWord = originalWord;
            return true;
        }
        currentWord = originalWord;
        return false;
    }

    @Override
    public void endGame(boolean won) {
        if (won) {
            System.out.println("Congratulations! You've won the game!");
            System.out.println("The word was: " + currentWord);
        } else {
            System.out.println("Game over! Better luck next time.");
            System.out.println("The word was: " + currentWord);
        }
        inputField.setEnabled(false);
        stopTimer();
    }
    @Override
    public void startGame() {
        super.startGame();
        startTimer();
    }
    public void startTimer() {
        if (timerRunning) {
            stopTimer();
        }
        timerRunning = true;
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }
    public void stopTimer() {
        timerRunning = false;
        if (timerThread != null) {
            timerThread.interrupt();
        }
    }
}
