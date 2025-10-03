package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String name = "Ari";          // text
        int health = 60;             // whole number
        int gold = 25;                 // whole number
        boolean hasKey = true;       // true/false
        String[] inventory = new String[5]; // slots for items

        inventory[0] = "Wooden Sword";

        System.out.println(name + " HP: " + health + ", Gold: " + gold);

        int coins = 0;
        for (int room = 1; room <= 5; room++) {
            coins += 10; // found 10 coins in each room
            System.out.println("Room " + room + ": +10 coins (total " + coins + ")");
        }

        int goblins = 3;
        int goblinHP = 30;
        int playerDamage = 15;

        while (goblins > 0) {
            System.out.println("Ari attacks a goblin!");
            goblinHP -= playerDamage;

            if (goblinHP <= 0) {
                goblins--;           // one goblin down
                goblinHP = 30;       // next goblin appears
                System.out.println("Goblin defeated! Remaining: " + goblins);
            }
        }
        System.out.println("All orcs defeated!");

        gold = 0;
        for (int chest = 1; chest <= 4; chest++) {
            gold += 12;
        }
        System.out.println("Total gold: " + gold); // 48


    }

    public boolean takeDamage(int dmg, boolean name) {
        int health = dmg;
        System.out.println(name + " takes " + dmg + " damage! (HP now " + health + ")");
        if (health > 45) {
            System.out.println(name + " is still not dead!");
            return true;
        } else {
            System.out.println(name + " needs health!");
            return false;
        }
    }
}    