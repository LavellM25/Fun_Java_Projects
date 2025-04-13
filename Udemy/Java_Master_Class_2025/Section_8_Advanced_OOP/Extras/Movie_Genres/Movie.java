package Section_8_Advanced_OOP.Extras.Movie_Genres;

/** In this project I will have three subclasses:
 * Adventure.java, Comedy.java, ScienceFiction.java
 *
 */

public class Movie {

    // Create the constant variable here
    private String title;

    // Create a constructor that will pass in the variable title
    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

}
