package Section_8_Advanced_OOP.Extras.Movie_Genres;

public class Adventure extends Movie{

    // Constructor created to extend attributes of the movie
    public Adventure(String title) {
        super(title);
    }

    // Override the watchMovie() method from the Movie.java file
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}
