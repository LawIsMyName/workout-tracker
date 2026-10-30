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
                case "N" -> addWorkout();
                case "W" -> runWorkoutsListScreen();
                case "X" -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid command.");
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
                case "A" -> displayAllWorkouts();
                case "Q" -> displayQuickWorkouts();
                case "F" -> displayFavorites();
                case "S" -> runSearchScreen();
                case "H" -> {
                }
                default -> System.out.println("Invalid command.");
            }

        } while (!command.equals("H"));
    }

    public static void runSearchScreen() {
        String command;

        do {
            System.out.println("""
                    
                    === Search ===
                    1) By Name
                    2) By Type
                    3) By Length
                    0) Back
                    """);

            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim();

            switch (command) {
                case "1":
                    searchByName();
                    break;
                case "2":
                    searchByType();
                    break;
                case "3":
                    searchByLength();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }

        } while (!command.equals("0"));
    }

    private static void addWorkout() {
        System.out.println(" TODO: add workout test");
    }

    private static void displayAllWorkouts() {
        System.out.println("TODO: display all workouts");
    }

}





