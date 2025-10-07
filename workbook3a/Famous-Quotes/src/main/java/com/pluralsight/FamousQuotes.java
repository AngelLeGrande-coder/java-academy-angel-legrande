package com.pluralsight;


import java.util.Scanner;


public class FamousQuotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //list of quotes from anime's
        String[] quotes = {
                "if you win, you live. If you lose, you die. If you don't fight , you can't win!. - Eren",
                "The only thing we're allowed to do is to believe that we won't regret the choice we made. - Levi",
                "No matter how messed up things get, you can always figure out a way to fix them. - Hange",
                "The world is cruel, but it's also very beautiful. - Mikasa",
                "When people are faced with a situation they don't understand, it's easy for fear to take hold. - Armin",
                "I don't know what's right anymore. But I do know that I have to keep moving forward. - Eren",
                "A person who can't sacrifice anything can't change anything. - Armin",
                "The only truth in this world is that there is no truth. Everyone just believes what they want to believe. - Jean",
                "Once I'm dead, I won't even be able to remember you. So I'll win, no matter what. I'll live , no matter what! - Mikasa",
                "I think the best discipline is to make yourself believe in the choices you make. - Erwin"
        };

        System.out.print("Select a number between 1 and 10: ");
        int choice = input.nextInt();



        System.out.println("Quote #" + choice + ": " + quotes[choice - 6]);
    }
}