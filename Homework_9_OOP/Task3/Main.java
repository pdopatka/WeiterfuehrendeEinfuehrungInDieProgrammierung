package Homework_9_OOP.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 9, 2010),
            new Movie("The Matrix", 8, 1999),
            new Movie("Interstellar", 8, 2014),
            new Movie("The Godfather", 10, 1972),
            new Movie("Pulp Fiction", 9, 1994),
            new Movie("The Dark Knight", 9, 2008)
        );

        List<Movie> filteredSorted = movies.stream()
            .filter(m -> m.getRating() >= 8.5)
            .sorted(
                Comparator.comparing(Movie::getYear)
                          .thenComparing(Comparator.comparing(Movie::getRating).reversed())
            )
            .collect(Collectors.toList());

        filteredSorted.forEach(m -> 
            System.out.println(m.getTitle() + " (" + m.getYear() + ") - Rating: " + m.getRating())
        );
    }
}