package Section_8_Advanced_OOP.Extras.Movie_Genres;

// This project works on understanding the programming concepts of polymorphism

public class Main {
    public static void main(String[] args) {

        // Test the methods in the Movie.java file
        Movie Movie = new Movie("Star Wars");
        Movie.watchMovie();
        System.out.println(); // Line separator

        // Test the Adventure.java file
        Adventure Adventure = new Adventure("The Great Adventure");
        Adventure.watchMovie();
        System.out.println(); // Line separator

        // Test the ScienceFiction.java file
        ScienceFiction ScienceFiction = new ScienceFiction("Severance");
        ScienceFiction.watchMovie();
        System.out.println(); // Line separator

        // Test the Comedy.java file
        Comedy Comedy = new Comedy("Good Times");
        Comedy.watchMovie();
    }
}
