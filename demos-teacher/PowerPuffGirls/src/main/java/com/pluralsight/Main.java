package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Todo: A PowerPuff fighting game
        // Features
        // Play online, play solo

        // Customizing Characters
        //  Customes
        // Finishing Moves
        // Team attack
        // Dialogue
        // Health boost

        PowerpuffGirl blossom = new PowerpuffGirl("Blossom", "pink");
        System.out.println(blossom.getHealth());
        blossom.setHealth(21);

        PowerpuffGirl bubbles = new PowerpuffGirl("Bubbles",  "blue");

        System.out.println("Bubbles");

        System.out.println("Dealt 15 damage");
        bubbles.setHealth(45);
        System.out.println(bubbles);

        bubbles.gethealth(100);
        System.out.println(bubbles);




    }

}