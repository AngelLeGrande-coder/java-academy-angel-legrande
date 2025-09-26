package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hi("Bilal"); // Call the function -> It runs that piece of code. Benefits of reuse
        Hi("Nazik");
        Hi("Angel");


        // I grab the SenzuBean ->
        IncreasePowerLevel(90000);
    }

    public static void Hi(String name) {
        System.out.println("I wish you a warm welcome " + name);
    }

    public static void IncreasePowerLevel(int powerlevel) {
        System.out.println("The power level has been increased with " + powerlevel);
    }
}