package basics;

public class July_28_2022 {
	/* The area in the memory which the JVM stores to is known as the heap. It is also
	 * more generically called the RAM in your computer. When we create an array we allocate
	 * a new heap with a set size. 
	 * 
	 * In order to return an array you need to have the return type in the header!
	 * When we need to return a full array, we return the full array.
	 * 
	 * Remember that indexes go from 0 to n-1 where n is the length of the array.
	 * 
	 * 
	 * */
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for(int i = 0, j = result.length - 1;  i < list.length; i++, j--) {
			result[j] = list[i];
		}
		
		// Index 0 of source is stored in index n-1 of result
		// Index 1 of source is stored in index n-2 of result...
		// ...
		// Index (result.length-1) of source is stored in index 0 of result
		
		return result;
	}
	
	/* Linear search and binary search.*/
	public static int linearSearch(double[] array, double key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i; 
			}
			else {
				continue;
			}
		}
		return -1;
	}
	
	public static int binarySearch(double[] array, double key) {
		
		int lower = 0, higher = array.length-1; 
		while(lower < higher) {
			int midpoint = 1 + (higher-1)/2;
			
			if(array[midpoint] == key) {
				return midpoint;
			}
			else if(array[midpoint] < key) {
				lower = midpoint + 1;
			}
			else {
				higher = midpoint - 1;
			}	
		}
		
		return -1;
	}
	
	/* Selection sort */
	public static void selectionSort(double[] arr) {
	        int n = arr.length;
	  
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;
	  
	            // Swap the found minimum element with the first
	            // element
	            double temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	}
	
	public static void main(String[] args) {
		
	}
	
}
