package java_work.day_3;   // user-defined package

import java.util.Scanner;  // to read user input

public class Day_3_Classwork {

    public static void main(String[] args) {

        // Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Asking for first name
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        // Asking for age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Displaying a welcome message
        System.out.println("\n--- Registration Successful ---");
        System.out.println("Welcome " + firstName + "!");
        System.out.println("Your age is: " + age);

        sc.close();  // closing the scanner
    }
}