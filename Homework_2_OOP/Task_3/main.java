package Homework_2_OOP.Task_3;

public class main {
    public static void main(String[] args) {
        Mail mail1 = new Mail("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow at 10 AM.", "2025-04-20 09:00");
        Mail mail2 = new Mail("bob@example.com", "Project Update", "The project is on track for completion.", "2025-04-19 14:30");
        Mail mail3 = new Mail("charlie@example.com", "Lunch?", "Want to grab lunch tomorrow?", "2025-04-18 12:15");
        Inbox inbox = new Inbox(new Mail[] { mail1, mail2, mail3 });
        System.out.println("Mail Headers:");
        String[] headers = inbox.printHeaders();
        for (String header : headers) {
            System.out.println(header);
        }
        System.out.println("\nUnread Mails Count: " + inbox.countUnreadMails());
        System.out.println("\nOpening Mail at Index 0:");
        System.out.println(inbox.open(0));
        mail1.markAsRead();
        System.out.println("\nUnread Mails Count: " + inbox.countUnreadMails());
    }
}