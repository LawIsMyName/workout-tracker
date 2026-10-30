package com.pluralsight;

import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void runHomeScreen() {
        String command;

        do {
            System.out.println("""
                    
                    === Home ===
                    N) New Workout
                    W) Workouts list
                    X) Exit
                    """);

            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "N":
                    addWorkout();
                    break;
                case "W":
                    runWorkoutsListScreen();
                    break;
                case "X":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }

        } while (!command.equals("X"));

    }

    public static void runWorkoutsListScreen() {
        String command;

        do {
            System.out.println("""
                    
                    === Workouts ===
                    A) All Workouts
                    Q) Quick Workouts
                    F) Favorites
                    S) Search
                    H) Home
                    """);

            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A":
                    displayAllWorkouts();
                    break;
                case "Q":
                    displayQuickWorkouts();
                    break;
                case "F":
                    displayFavorites();
                    break;
                case "S":
                    runSearchScreen();
                    break;
                case "H":
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }

        } while (!command.equals("H"));




    }
}
