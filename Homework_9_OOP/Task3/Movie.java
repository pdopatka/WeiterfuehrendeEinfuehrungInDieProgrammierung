package Homework_9_OOP.Task3;

public class Movie implements Comparable<Movie> {
    private String title;
    private int rating;
    private int year;
    
    public Movie(String title, int rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie other) {
        if (this.rating != other.rating) {
            return Integer.compare(other.rating, this.rating);
        }
        return Integer.compare(this.year, other.year);
    }
}
