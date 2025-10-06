package com.pluralsight;
import  java.util.Scanner;

import  java.time.LocalDate;

import  java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String fullName = sc.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy):");
        String dateInput = sc.nextLine();
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate showDate = LocalDate.parse(dateInput, inputFormat);

        System.out.print("How many tickets would you like?");
        int tickets = sc.nextInt();


        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[parts.length - 1];


        String ticketWord = (tickets == 1) ? "ticket" : "tickets";
        System.out.println(tickets + " " + ticketWord +
                " reserved for" + showDate + " under " + lastName + ", " + firstName);

        sc.close();
    }
}