package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //primitive variables
        boolean alreadyAte = false;
        boolean canCook = false;

        //reference variables
        String firstName = "Angel";
        String lastName = "LeGrande";
        String fullName = firstName + " " + lastName;
        String favColor = "red";

        String favArtist = "Michael Jackson";
        System.out.println(fullName + "'s favorite artist is " + favArtist);
        favArtist = "Michael Jackson";
        System.out.println(fullName + "'s new favorite artist is " + favArtist);

        if (alreadyAte) {
            System.out.println("Nice! " + firstName + " has energy for the day.");
        }
        else if (!alreadyAte && canCook){
            System.out.println(firstName + " is hungry and can cook.");
        }
        else if (!alreadyAte && !canCook) {
            System.out.println(firstName + " is so hungry, but he can't cook. He's cooked.");
        }

        //exercise - mood & breakfast checker
        boolean isHappy = true;
        boolean hadBreakfast = false;

        if (isHappy && hadBreakfast) {
            System.out.println("Yay, nice job!");
        }
        else if (isHappy && !hadBreakfast) {
            System.out.println("You might be hungry...");
        }
        else if (!isHappy && hadBreakfast) {
            System.out.println("Was your breakfast bad? :(");
        }
        else {
            System.out.println("You're hangry. Do something quick!!");
        }

    }
}