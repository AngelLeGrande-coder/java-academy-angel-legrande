package com.pluralsight;

public class FullNameGenerator {
    public static void main(String[] args) {
        // Hard-coded name parts
        String firstName = "Angel";
        String middleName = "R.";
        String lastName = "LeGrande";


        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);

        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

        System.out.println("Full name: " + fullName.toString());
    }
}
