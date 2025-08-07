# 🎵 Exercise 45: Playlist Application (Java OOP Project)

## 📘 Overview

This project simulates a basic music playlist system using **Java Object-Oriented Programming** concepts. It lets you:

- Create music albums with multiple songs.
- Build a playlist from those albums using song titles or track numbers.
- Display and verify songs added to a playlist.
- Handle errors such as invalid song names or track numbers.

This exercise strengthens your understanding of **classes**, **objects**, **collections (`ArrayList`, `LinkedList`)**, **encapsulation**, and **method overloading** in Java.

---

## 🏗️ Class Structure

### 1. `Song.java`
- Represents a single song with a `title` and `duration`.
- Provides `getTitle()` and `getDuration()` methods.
- Overrides `toString()` to print song details in the format: `Song Title: duration`.

### 2. `Album.java`
- Represents a music album.
- Contains:
    - Album name and artist
    - A list of songs (`ArrayList<Song>`)
- Key methods:
    - `addSong(title, duration)` — Adds a new song to the album.
    - `addToPlayList(title, playlist)` — Adds a song by title to a playlist.
    - `addToPlayList(trackNumber, playlist)` — Adds a song by its track number.

### 3. `Sample.java`
- Main class that:
    - Creates albums and adds songs.
    - Builds a playlist (`LinkedList<Song>`) from songs across albums.
    - Displays the final playlist and any errors encountered.

---

## 📂 Folder & File Structure

📁 PlaylistApp/
├── Album.java
├── Song.java
└── Sample.java

---

## 🧠 Concepts Practiced

| Concept | Description |
|--------|-------------|
| Class Composition | Using one class (`Album`) to contain a list of other objects (`Song`) |
| Encapsulation | Keeping fields private and exposing only needed methods |
| Method Overloading | `addToPlayList(String title, LinkedList<Song>)` vs `addToPlayList(int track, LinkedList<Song>)` |
| Data Structures | Using `ArrayList` for albums and `LinkedList` for playlist management |
| Defensive Programming | Handling invalid input such as non-existent songs or track numbers |

---

## 📈 Extension Ideas (Optional)
- Add console interaction: play, next, previous, repeat, remove.
- Use a ListIterator to navigate the playlist like a real music player.
- Save and load playlists using file I/O.
- Add album artwork or genre fields using enums or additional classes.

---

## 🧪 Sample Output

```plaintext
Song "Speed king" not found in album.
This album does not have a track 24

Playlist:
You can't do it right: 6.23
Holy man: 4.3
Soldier of fortune: 3.13
Lets go: 3.45
I put the finger on you: 3.25

