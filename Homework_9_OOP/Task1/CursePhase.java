package Homework_9_OOP.Task1;

public enum CursePhase {
    NOT_STARTED("Course not started yet"),
    IN_PROGRESS("Course is in progress"),
    FINISHED("Course has ended");

    private final String message;

    CursePhase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
