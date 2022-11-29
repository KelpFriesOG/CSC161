package classFinal;

import java.util.Scanner;

public class Question2 {

    public static double average(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        System.out.println("Enter 10 double values: ");
        Scanner input = new Scanner(System.in);
        String vals = input.nextLine();
        String[] splitVals = vals.split(" ");
        double[] parsedVals = new double[10];

        for (int score = 0; score < splitVals.length; score++) {
            parsedVals[score] = Double.parseDouble(splitVals[score]);
        }

        System.out.println("The average of the given values is " + average(parsedVals));

        input.close();

    }
}
