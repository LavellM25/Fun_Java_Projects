# 🎬 Java Polymorphism with Movie Genres

This project demonstrates the concept of **polymorphism** in Java using a creative and relatable theme — **movie genres**. 
It is built as part of a learning module in advanced object-oriented programming.

## ✅ How to Run
- Clone this repository: 
- git clone https://github.com/your-username/movie-genres-polymorphism.git



## 📚 Concepts Covered

- **Object-Oriented Programming (OOP)**
- **Inheritance**
- **Method Overriding**
- **Polymorphism**

## 🧠 What is Polymorphism?

Polymorphism allows objects of different subclasses to be treated as objects of a common superclass. 
In Java, this is often used to call overridden methods through a reference of the parent class, allowing each subclass to provide its own behavior.

In this project, we use polymorphism to simulate watching different types of movies: **Adventure**, **Comedy**, and **Science Fiction**.


## 🔍 Class Breakdown

### `Movie.java` (Superclass)

- Base class with a `title` attribute.
- Contains the `watchMovie()` method to display a message based on the movie genre.

### `Adventure.java`, `Comedy.java`, `ScienceFiction.java` (Subclasses)

- Extend the `Movie` superclass.
- Override the `watchMovie()` method to display genre-specific scenes.

### `Main.java`

- Demonstrates polymorphism by creating instances of each genre.
- Each instance calls the `watchMovie()` method, which behaves differently based on the subclass.

## 💻 Example Output

```text
Star Wars is a Movie film

The Great Adventure is a Adventure film
..Pleasant Scene
..Scary Music
..Something Bad Happens

Severance is a ScienceFiction film
..Bad Aliens do Bad Stuff
..Space Guys Chase Aliens
..Planet Blows Up

Good Times is a Comedy film
..Somethiing funny happens
..Something even funnier happens
..Happy Ending
