package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a game score");
        String input = sc.nextLine().trim();


        System.out.println("You entered: " + input);

        String[] parts = input.split("\\|");

        if (parts.length!=2) {
            System.out.println("Invalid format. Use Home:Visitor|21:9");
            return;
        }

        String teamsPart = parts[0];
        String scoresPart = parts[1];

        System.out.println("Teams part: " + teamsPart);
        System.out.println("Scores part: " + scoresPart);



        String[] teams = teamsPart.split(":");
        if (teams.length != 2) {
            System.out.println("Invalid format. Example: Home:Visitor|21:9");
            return;
        }

        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();

        System.out.println("Home: " + homeTeam);
        System.out.println("Visitor: "+ visitorTeam);


        String[] scores = scoresPart.split(":");
        if (scores.length != 2) {
            System.out.println("Invalid format. Example: Home:Visitor|21:9");
            return;
        }
        String homeScoreStr = scores[0].trim();
        String visitorScoreStr = scores[1].trim();

        int homeScore;
        int visitorScore;

        try {
            homeScore = Integer.parseInt(homeScoreStr);
            visitorScore = Integer.parseInt(visitorScoreStr);

        } catch (NumberFormatException e) {
            System.out.println("Scores must be whole numbers like 21:9");
            return;
        }
        System.out.println("Home score:" + homeScore);
        System.out.println("Visitor score:" + visitorScore);

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner:" + visitorTeam);
        } else {
            System.out.println("Tie");
        }
    }
}