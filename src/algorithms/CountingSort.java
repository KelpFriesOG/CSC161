package algorithms;

import java.util.Arrays;

public class CountingSort {
	
	public static void sort(int[] input, int k) {
	    // create buckets
	    int counter[] = new int[k + 1];
	    
	    // fill buckets
	    for (int i : input) {
	      counter[i]++;
	    }
	    
	    // sort array
	    int ndx = 0;
	    for (int i = 0; i < counter.length; i++) {
	      while (0 < counter[i]) {
	        input[ndx++] = i;
	        counter[i]--;
	      }
	    }
	  }
	
	public static void sort(char arr[])
    {
        int n = arr.length;
 
        // The output character array that will have sorted arr
        char output[] = new char[n];
 
        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
 
        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
 
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
 
        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
 
        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
 
    // Driver method
    public static void main(String args[])
    {
        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
                       'r', 'g', 'e', 'e', 'k', 's' };
 
        int arr2[] = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
        int k = 60;
        
        sort(arr);
        sort(arr2, k);
 
        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
        
        System.out.print("\nSorted numerical array is ");
        System.out.print(Arrays.toString(arr2));
        
    }
}