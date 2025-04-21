package Homework_2_OOP.Task_3;

public class Inbox {
    public Mail[] mails;
    public Inbox(Mail[] mails) {
        this.mails = mails;
    }
    public String[] printHeaders() {
        String header = "Sender %s\nSubject %s\nDate and Time %s\nRead %b\n";
        String[] headers = new String[mails.length];
        for (int i = 0; i < mails.length; i++) {
            headers[i] = String.format(header, mails[i].getSender(), mails[i].getSubject(), mails[i].getDatetime(), mails[i].isRead());
        }
        return headers;
    }
    public Integer countUnreadMails() {
        int count = 0;
        for (Mail mail : mails) {
            if (!mail.isRead()) {
                count++;
            }
        }
        return count;
    }
    public String open(int index) {
        if (index < 0 || index >= mails.length) {
            return "Invalid index";
        }
        Mail mail = mails[index];
        return mail.printOut();
    }
}
