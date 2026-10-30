package com.pluralsight;

import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void runHomeScreen() {
        String command;

        while (!command.equals("X")) {
            System.out.println("""
                    
                    === Home ===
                    N) New Workout
                    W) Workouts
                    X) Exit
                    """);

            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toUpperCase();

            


        }
    }
}
