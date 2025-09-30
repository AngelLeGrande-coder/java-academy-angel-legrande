package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        FinancialCalculator finCalc = new FinancialCalculator();

        System.out.println("*** Welcome to our Financial Calculators! ***");
        String choice = "";

        while (!choice.equalsIgnoreCase("x")) {
            finCalc.printMenu();
            choice = scnr.nextLine();

            if (choice.equals("1")) {
                finCalc.mortgageCalculator(scnr);
            }
            else if (choice.equals("2")) {
                finCalc.cdCalculator(scnr);
            }
            else if (choice.equals("3")) {
                finCalc.annuityCalculator(scnr);
            }
            else if (!choice.equalsIgnoreCase("x")) {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("""
                \nThank you for using our Financial Calculators.
                *** Goodbye! ***""");
        scnr.close();
    }
    public void printMenu() {
        System.out.print("""
                \n---------------------------------------------------------------------
                What calculator would you like to use?
                    1. Mortgage Calculator - Find Monthly Payment & Interest
                    2. CD Calculator - Find Future Value of Your CD's One-Time Deposit
                    3. Annuity Calculator - Find Present Value of an Ordinary Annuity
                    X. Exit
                Enter your choice (1, 2, 3, or X):\s""");
    }
    public void mortgageCalculator(Scanner scnr) {
        System.out.println("\n*** Mortgage Calculator ***");

        //get inputs
        System.out.print("Enter principal (loan value, w/o symbols): ");
        double principal = scnr.nextDouble();
        System.out.print("Enter annual interest rate (in decimal form; ex: 5% -> 0.05): ");
        double annualInterestRate = scnr.nextDouble();
        System.out.print("Enter length of loan (in years): ");
        int numYears = scnr.nextInt();
        scnr.nextLine();
        int numMonths = numYears * 12;
        double monthlyInterestRate = annualInterestRate / 12;


        double monthlyPayment = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numMonths)
                / (Math.pow(1 + monthlyInterestRate, numMonths) - 1));
        double totalInterest = (monthlyPayment * numMonths) - principal;

        //print result
        System.out.printf("\nA $%.2f loan at %.4f", principal, annualInterestRate * 100);
        System.out.println("% annual interest for " + numYears + " years");
        System.out.printf("would have a $%.2f/mo payment with a total interest of $%.2f.\n",
                monthlyPayment, totalInterest);
    }


    public void cdCalculator(Scanner scnr) {
        System.out.println("\n*** CD Future Value Calculator ***");

        //get inputs
        System.out.print("Enter principal/initial deposit (w/o symbols): ");
        double principal = scnr.nextDouble();
        System.out.print("Enter annual interest rate (in decimal form; ex: 5% -> 0.05): ");
        double annualInterestRate = scnr.nextDouble();
        System.out.print("Enter number of years that CD will mature: ");
        int numYears = scnr.nextInt();
        scnr.nextLine(); //consume leftover CRLF

        double futureValue = principal *
                Math.pow(1 + (annualInterestRate / 365), 365 * numYears);
        double totalInterest = futureValue - principal;

        //print information
        System.out.printf("\nIf you deposit $%.2f in a CD that earns %.4f", principal, annualInterestRate * 100);
        System.out.println("% annual interest and matures in " + numYears + " years,");
        System.out.printf("your CD's ending balance will be $%.2f, and you would have earned $%.2f in interest.\n",
                futureValue, totalInterest);
    }
    public void annuityCalculator(Scanner scnr) {
        System.out.println("\n*** Ordinary Annuity Present Value Calculator ***");
        System.out.print("Enter monthly payout (w/o symbols): ");
        double monthlyPayout = scnr.nextDouble();
        System.out.print("Enter expected annual interest rate (in decimal form; ex: 5% -> 0.05): ");
        double annualInterestRate = scnr.nextDouble();
        System.out.print("Enter number of years to pay out" +
                "\n(aka how long you want to receive monthly payments): ");
        int numYears = scnr.nextInt();
        scnr.nextLine(); //consume leftover CRLF

        double presentValue = monthlyPayout * (
                (1 - Math.pow(1 + annualInterestRate / 12, -12 * numYears))
                        / (annualInterestRate / 12));

        System.out.printf("\nTo fund an annuity that pays $%.2f monthly for " + numYears + " years "
                + "and earns an expected %.4f", monthlyPayout, annualInterestRate * 100);
        System.out.println("% interest,");
        System.out.printf("you would need to invest $%.2f today.\n", presentValue);
    }
}