package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        CellPhone myPhone1 = new CellPhone();

        System.out.print("What is the serial number? ");
        myPhone1.setSerialNumber(Scanner.nextInt());
        Scanner.nextLine();

        System.out.print("What model is the phone? ");
        myPhone1.setModel(Scanner.nextLine());


        System.out.print("Who is the carrier? ");
        myPhone1.setCarrier(Scanner.nextLine());


        System.out.print("What is the phone number? ");
        myPhone1.setPhoneNumber(Scanner.nextLine());


        System.out.print("Who is the owner of the phone? ");
        myPhone1.setOwner(Scanner.nextLine());

        CellPhone myPhone2 = new CellPhone();

        System.out.print("What is the serial number? ");
        myPhone2.setSerialNumber(Scanner.nextInt());
        Scanner.nextLine();

        System.out.print("What model is the phone? ");
        myPhone2.setModel(Scanner.nextLine());


        System.out.print("Who is the carrier? ");
        myPhone2.setCarrier(Scanner.nextLine());


        System.out.print("What is the phone number? ");
        myPhone2.setPhoneNumber(Scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        myPhone2.setOwner(Scanner.nextLine());

        System.out.println("\n--- Cell Phone Information ---");
        display(myPhone1);
        display(myPhone2);

        System.out.println("\n--- Dailing --- ");
        myPhone2.dial(myPhone1.getPhoneNumber());
        myPhone1.dial(myPhone2.getPhoneNumber());

    }
    public static void display(CellPhone myPhone) {
        System.out.println("\nCell Phone Information:");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

    }
}