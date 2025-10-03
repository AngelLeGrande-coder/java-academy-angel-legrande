package com.pluralsight;

public class examGradechecker {
    public static void main(String[] args) {
        int score = 67;

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }
    }
}
