package Section_8_Advanced_OOP.Extras.Movie_Genres;


// The code from the adventure.java file and Comedy.java file will be the same code
// and will be re-used and modified accordingly

public class ScienceFiction extends Movie{

    // Constructor created to extend attributes of the movie
    public ScienceFiction(String title) {
        super(title);
    }

    // Override the watchMovie() method from the Movie.java file
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}

