package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Coding_Exercises.Exercise45;

/**
 * Here is the sample code for Exercise 45. Song.Java and Album.Java has to be in this file otherwise the code will break.
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Sample {  // (main class) that creates albums, adds songs, and builds a playlist

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);         // Does not exist
        albums.get(0).addToPlayList(9, playList);             // "Soldier of fortune"
        albums.get(1).addToPlayList(3, playList);             // "Lets go"
        albums.get(1).addToPlayList(2, playList);             // "I put the finger on you"
        albums.get(1).addToPlayList(24, playList);            // Does not exist

        System.out.println("\nPlaylist:");
        for (Song song : playList) {
            System.out.println(song);
        }
    }

    // Album.java
    public static class Album {  // This class represents a music album containing multiple songs.

        // Two private fields
        private String name;    // The name/title of the album
        private String artist;  // The artist or band who created the album

        // Collection of songs in the album
        private ArrayList<Song>songs;  // Dynamic list of Song objects in this album

        /**
         * Constructor to create a new Album with a name and artist.
         * @param name   The name of the album.
         * @param artist The artist/band who made the album.
         */
        public Album(String name, String artist) {
            this.name = name;                     // Set album name
            this.artist = artist;                 // Set album artist
            this.songs = new ArrayList<>();       // Initialize the song list
        }

        /**
         * Adds a new song to the album if it doesn't already exist.
         * @param title    The title of the song.
         * @param duration The duration of the song.
         * @return true if the song was added, false if it already exists.
         */
        public boolean addSong(String title, double duration) {
            // Use helper method to check for duplicates by title
            if (findSong(title) == null) {
                songs.add(new Song(title, duration));   // Create and add new Song object
                return true;
            }
            return false;  // Duplicate found, so do not add
        }

        /**
         * Private helper method to find a song in the album by title.
         * @param title The title to search for.
         * @return The Song object if found, or null if not found.
         */
        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    return song;   // Found a match (case-insensitive)
                }
            }
            return null;  // No match found
        }

        /**
         * Adds a song to a playlist by its title (e.g., "Holy Man").
         * @param title     The title of the song to add.
         * @param playList  The playlist to add the song to.
         * @return true if the song was found and added; false otherwise.
         */
        public boolean addToPlayList(String title, LinkedList<Song> playList) {
            Song song = findSong(title);   // Try to find the song in this album
            if (song != null) {
                playList.add(song);        // Add song to the playlist
                return true;
            }
            // Song title not found in album
            System.out.println("Song " + title + " not found in album.");
            return false;
        }

        /**
         * Adds a song to the playlist based on its track number.
         * Track numbers start at 1 (not 0).
         * @param trackNumber The 1-based index of the song in the album.
         * @param playList    The playlist to add the song to.
         * @return true if the track exists and is added; false otherwise.
         */
        public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
            int index = trackNumber - 1;      // Convert to 0-based index

            // Check if index is valid
            if (index >= 0 && index < songs.size()) {
                playList.add(songs.get(index));   // Add the song at the given index
                return true;
            }

            // Track number is invalid (too high or too low)
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    // Song.java
    public static class Song {  // This class represents a single song with a title and duration

        // Two private fields to store the title and duration of the song
        private String title;
        private double duration;

        /**
         * Constructor to initialize a Song object with its title and duration.
         * @param title    The title/name of the song.
         * @param duration The duration of the song in minutes (e.g., 4.25 for 4 minutes and 15 seconds).
         */
        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        /**
         * Getter method for the title.
         * @return The title of the song.
         */
        public String getTitle() {
            return title;
        }

        /**
         * Getter method for the duration.
         * @return The duration of the song.
         */
        public double getDuration() {
            return duration;
        }

        /**
         * Overrides the default toString() method to print song information.
         * Example output: "Soldier of Fortune: 3.13"
         */
        @Override
        public String toString() {
            return this.title + ": " + this.duration;
        }
    }
}

/*
| Concept            | Explanation                                                   |
| ------------------ | ------------------------------------------------------------- |
| `ArrayList<Song>`  | Stores songs dynamically, allows flexible addition/removal    |
| `LinkedList<Song>` | Used as the playlist so you can go forward/back easily        |
| `findSong()`       | Private method to look up a song by its title                 |
| `addSong()`        | Adds a new song to the album only if it doesn't already exist |
| `addToPlayList()`  | Adds a song to the playlist by title or track number          |
| `toString()`       | Allows easy printing of a song (title + duration)             |
 */


/** Actual Songs Successfully Added
 * | Source Album | Method Called | Song Added              |
 * | ------------ | ------------- | ----------------------- |
 * | Stormbringer | By Title      | You can't do it right   |
 * | Stormbringer | By Title      | Holy man                |
 * | Stormbringer | By Track (9)  | Soldier of fortune      |
 * | AC/DC        | By Track (3)  | Lets go                 |
 * | AC/DC        | By Track (2)  | I put the finger on you |
 *
 * Songs NOT Found
 * | Attempted Action              | Result                       |
 * | ----------------------------- | ---------------------------- |
 * | Add "Speed king" by title     | ❌ Song not found in album    |
 * | Add track 24 from AC/DC album | ❌ Track number out of bounds |
 */