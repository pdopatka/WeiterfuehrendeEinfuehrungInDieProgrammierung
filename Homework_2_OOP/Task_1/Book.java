public class Book extends Publication {
    private String author;

    public Book(String title, String author, int year){
        super(title, year);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
    @Override
    public String getInfo() {
        String myString = ", by %s";
        return super.getInfo() + String.format(myString, author);
    }
}