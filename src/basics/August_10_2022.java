package basics;

import java.util.Arrays;

public class August_10_2022 {

    /*
     * Chapter 8: Multidimensional Arrays!
     * 
     * Multidimensional arrays store arrays within arrays,
     * ...within arrays.... e.t.c
     * 
     * If we say a 1D array has a size of 3
     * [1, 2, 3]
     * it has 3 values in it.
     * 
     * Suppose we wanted to make an array with 2 1D arrays that had
     * 3 values each. Then it would need to look something like:
     * 
     * [[1, 2, 3], [4, 5, 6]]
     * 
     * This array is 2 dimensional, because it has a sequence of arrays
     * within the outermost array!
     * 
     * What would the dimensionality of the array be?
     * 
     * Let's represent the array like so:
     * [[1, 2, 3],
     * [4, 5, 6]]
     * 
     * In a readable representation of a 2D array we see that it has
     * 2 rows (# of subarrays), and 3 columns (values in each subarray).
     * 
     * Therefore the dimensions or size can be defined as:
     * rows * columns
     * For the example the size would be 2 * 3
     * 
     * ArrayList is async, Linked Lists are deprecated and synchronous.
     * Therefore Linked Lists are outdated and slow in comparison.
     * 
     */

    public static void main(String[] args) {

        // Declaring and initializing in one line
        double[][] coordinates = {
                { 1, 2 },
                { 2, 4 },
                { 3, 4 },
                { 7, 1 },
                { 9, 6 }
        };

        // Declaring with size for later assignments
        double[][] coords = new double[5][5];
        // First index tells you # of rows, second tells you the number of columns.

        for (int i = 0; i < coords.length; i++) // iterating through rows
            for (int j = 0; j < coords[i].length; j++) // iterating throughcolumns
                coords[i][j] = (int) (Math.random() * 100);

        // If each row has different sizes, then the overall array is a jagged array.

        // Summing up the numbers in a matrix
        double sum = 0;
        for (int i = 0; i < coords.length; i++) // iterating through rows
            for (int j = 0; j < coords[i].length; j++) // iterating throughcolumns
                sum += coords[i][j];

        double[][] enhanced = new double[5][5];

        for (double[] subarray : enhanced) {
            // Enhanced for loops cannot modify the contents of arrays
            // Techincal reason: the iterator in the header is a reference variable
            // it does not change the value at that position in the array, it exists as
            // a reference copy of it
            for (double value : subarray) {
                value = value + 1;
            }
        }

        System.out.println("Array 1 (initialized with set values):");

        for (double[] subarray : coordinates)
            System.out.println(Arrays.toString(subarray));

        System.out.println("\nArray 2 (initialized with random values from 0-99): ");

        for (double[] subarray : coords)
            System.out.println(Arrays.toString(subarray));

        System.out.println("Sum of values in random array: " + sum);

        System.out.println("\nArray 3 (we used an enhanced for loop, it does not work in initializing!): ");

        for (double[] subarray : enhanced)
            System.out.println(Arrays.toString(subarray));

    }

}