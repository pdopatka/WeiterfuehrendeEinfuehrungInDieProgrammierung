public class main {
    public static void main(String[] args) {
        Publication publication = new Publication("The Great Gatsby", 1925);
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Textbook textbook = new Textbook("Introduction to Algorithms", "Thomas H. Cormen", 2009, "Computer Science");

        System.out.println(publication.getInfo());
        System.out.println(book.getInfo());
        System.out.println(textbook.getInfo());
    }
}
