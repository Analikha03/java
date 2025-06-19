package fom.index;

import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 2 4 6 8
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine(); // Read input line

        String[] numbers = input.split(" "); // Split input into individual numbers

        for (String num : numbers) {
            switch (num) {
                case "0": System.out.print("Zero "); break;
                case "1": System.out.print("One "); break;
                case "2": System.out.print("Two "); break;
                case "3": System.out.print("Three "); break;
                case "4": System.out.print("Four "); break;
                case "5": System.out.print("Five "); break;
                case "6": System.out.print("Six "); break;
                case "7": System.out.print("Seven "); break;
                case "8": System.out.print("Eight "); break;
                case "9": System.out.print("Nine "); break;
                default: System.out.print("Invalid "); break;
            }
        }

        scanner.close();
    }
}