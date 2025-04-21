package Homework_2_OOP.Task_3;

public class Mail {
    boolean isRead = false;
    String sender;
    String subject;
    String message;
    String datetime;
    public Mail(String sender, String subject, String message, String datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
    }
    public String getSender() {
        return sender;
    }
    public String getSubject() {
        return subject;
    }
    public String getMessage() {
        return message;
    }
    public String getDatetime() {
        return datetime;
    }
    public boolean isRead() {
        return isRead;
    }
    public void markAsRead() {
        isRead = true;
    }
    public String printOut() {
        String myString = "Sender: %s\nDate and Time: %s\nSubject: %s\nMessage: %s\nRead: %b\n";
        return String.format(myString, sender, subject, message, datetime, isRead);
    }
}
