package com.pluralsight;

// Java Loop Examples
// Author: Remsey Mailjard

// Demonstrates: for loop, while loop, do...while loop

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. FOR LOOP
        // Use when you know how many times you want to repeat
        System.out.println("For Loop: Counting even numbers only");
        for (int i =2; i <= 20; i += 2) {
            System.out.println("Iteration " + i);
        }

        // 2. WHILE LOOP
        // Use when you don't know how many times in advance
        System.out.println("\nCountdown Timer: Starting from 5");

        int j = 6;
        while (j > 0) {
            System.out.println("Countdown: " + j);

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            j--;
        }

        System.out.println("Blast off!");

        // 3. DO...WHILE LOOP
        // Always runs at least once , even if condition is false
        System.out.println("\nDo...While Loop: User input until 'exit'");

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("exit")) {
                System.out.println("You typed: " + input);
            }

        } while (!input.equalsIgnoreCase("exit"));

        System.out.println(" Program ended.");
        scanner.close();
    }
}
