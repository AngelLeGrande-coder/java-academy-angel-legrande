package com.pluralsight;

public class ShoppingList {
    public static void main(String[] args) {
        String[] list = {"shrimp", "appicot", "watermelon", "pineapple", "waygu steak",
                "water bottles", "gloves", "napkins", "ice cream", "corn"};

        for (int i = 0; i < 10; ++i) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }
}