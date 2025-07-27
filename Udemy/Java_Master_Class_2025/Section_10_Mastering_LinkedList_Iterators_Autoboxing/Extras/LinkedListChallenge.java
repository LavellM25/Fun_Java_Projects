package Section_10_Mastering_LinkedList_Iterators_Autoboxing.Extras;

// 7/20/2025
// Objective: Create a list of places ordered by distance from a starting point.
// Use ListIterator to navigate the itinerary forwards and backwards (planned for future).
// This file builds the sorted list part and handles duplicate checking.

import java.util.LinkedList;
import java.util.Scanner;

// A record is a compact way to define a class with final fields, constructor, and toString().
record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("Place: %s, Distance: (%d)", name, distance);
    }
}

public class LinkedListChallenge {

    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        // Adding places using the custom addPlace method
        // These entries will be automatically sorted by distance
        Place MPLS = new Place("Mpls", 0);
        addPlace(placesToVisit, MPLS);

        addPlace(placesToVisit, new Place("mpls", 0));         // Duplicate name (case-insensitive), will be rejected
        addPlace(placesToVisit, new Place("china", 1000));
        addPlace(placesToVisit, new Place("East Africa", 2015));
        addPlace(placesToVisit, new Place("France", 11023));
        addPlace(placesToVisit, new Place("Europe", 2025));

        // But you might want to treat name case-insensitively in real app
        placesToVisit.add(new Place("Italy", 20));  // Bypasses sorting—direct add!

        // Print the list
        System.out.println(placesToVisit);

        var iterator = placesToVisit.iterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            System.out.println("Enter the name of the place: ");
            String menuItem = scanner.nextLine();

            switch (menuItem) {
                case "Forward":
                    System.out.println("User wants to go Forward");
                    break;
                case "Backward":
                    System.out.println("User wants to go Backward");
                    break;

                case "List":
                    System.out.println("User wants a list of the places");
                    break;
                case "Menu":
                    System.out.println("User wants a menu of the places");
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    /**
     * Adds a new place to the list while maintaining sorted order by distance.
     * Also avoids adding duplicates (same name or same object).
     */
    private static void addPlace(LinkedList<Place> list, Place place) {
        // Check if the exact Place object already exists in the list
        if (list.contains(place)) {
            System.out.println("Found duplicate place: " + place);
            return;
        }

        // Check for name duplicates (case-sensitive comparison)
        for (Place p : list) {
            if (p.name().equals(place.name())) {
                System.out.println("Found duplicate place: " + place);
                return;
            }
        }

        // This block maintains the list in sorted order based on distance
        int matchedIndex = 0;

        for (Place current : list) {
            // If the new place is closer than current, insert before current
            if (place.distance() < current.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        // If no closer match found, add to the end
        list.add(place);
    }

    private static void printMenu() {
        System.out.println("""
                Available actions (please select one of the following options):
                Forward
                Backward
                List Places
                Menu
                Quit
                """);
    }
}
