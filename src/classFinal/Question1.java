package classFinal;

import java.util.Scanner;

public class Question1 {
    public static double min(double[] array) {
        double min = array[0];
        for (int index = 1; index < array.length; index++) {
            min = array[index] < min ? array[index] : min;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);
        String vals = input.nextLine();
        String[] splitVals = vals.split(" ");
        double[] parsedVals = new double[10];

        for (int score = 0; score < splitVals.length; score++) {
            parsedVals[score] = Double.parseDouble(splitVals[score]);
        }

        System.out.println("The minimum value is: " + min(parsedVals));

        input.close();

    }
}
