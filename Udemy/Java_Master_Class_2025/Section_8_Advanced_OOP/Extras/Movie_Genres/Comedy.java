package Section_8_Advanced_OOP.Extras.Movie_Genres;

// Code from the Adventure.java file will be the same.


public class Comedy extends Movie{

    // Constructor created to extend attributes of the movie
    public Comedy(String title) {
        super(title);
    }

    // Override the watchMovie() method from the Movie.java file
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Somethiing funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}
