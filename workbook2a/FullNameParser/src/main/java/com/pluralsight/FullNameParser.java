package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: Angel L. LeGrande ");
        String input = scanner.nextLine().trim();

        // Split name into parts
        String[] parts = input.split("\\s+");

        String firstName = "";
        String middleName = "(None)";
        String lastName = "";

        if (parts.length == 2) {

            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {

            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("⚠️ Invalid name format. Please enter 'first last' or 'first middle last'.");
            return;
        }


        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
