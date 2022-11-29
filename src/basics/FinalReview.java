package basics;

import java.util.*;

public class FinalReview {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Kelp's CSC161 Review");
        System.out.println("Select a topic! \n");
        System.out.println("1) Introduction to Computers, Programs, and Java");
        System.out.println("2) Elementary Programs");
        System.out.println("3) Selections");
        System.out.println("4) Mathematical Functions, Characters, and Strings");
        System.out.println("5) Loops");
        System.out.println("6) Methods");
        System.out.println("7) 1D Arrays");
        System.out.println("8) Objects and Classes");

        boolean validInput = false;
        int selection = 0;

        do {
            System.out.println("Type an int which corresponds with the appropriate"
                    + "chapter: ");
            validInput = true;
            if (input.hasNextInt()) {
                selection = input.nextInt();
                validInput = true;
            } else {
                System.out.println("You have entered incorrect input!" +
                        "Please enter a whole number only");
                input.nextLine();
            }
        } while (validInput == false);

        Review review = new Review(true);
        review.Chapter1();

    }
}
