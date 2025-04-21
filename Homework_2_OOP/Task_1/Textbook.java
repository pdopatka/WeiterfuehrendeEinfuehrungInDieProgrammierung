public class Textbook extends Book{
    private String subject;

    public Textbook(String title, String author, int year, String subject){
        super(title, author, year);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public String getInfo() {
        String myString = " Subject: %s";
        return super.getInfo() + String.format(myString, subject);
    }
}