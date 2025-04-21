public class Publication {
    private String title;
    private int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
    
    public String getInfo() {
        String myString = "%s , published in %d";
        String formattedString = String.format(myString, title, year);
        return formattedString;
    }
}