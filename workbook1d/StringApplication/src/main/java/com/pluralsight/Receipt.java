package com.pluralsight;

//exercise 1
public class Receipt {
    public static void main(String[] args) {
        String itemName = "Solo Leveling Manga";
        double itemPrice = 29.99;
        int numItems = 14;

        double totalPrice = numItems * itemPrice;

        System.out.printf("You bought " + numItems + " " + itemName + "s for $%.2f! "
                + "These are my favorite!", totalPrice);
    }
}