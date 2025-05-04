package error_Handling;

	import java.util.*;
	public class Q6 {
	    public static void main(String[] args) {
	        int[] arr = {10, 3, 5, 7, 2, 9};

	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(arr));

	        // Sorting the array
	        Arrays.sort(arr);
	        System.out.println("\nSorted Array:");
	        System.out.println(Arrays.toString(arr));

	        // Searching for an element
	        Scanner in = new Scanner(System.in);
	        System.out.print("\nEnter a number to search: ");
	        int key = in.nextInt();int f=0;
	        for (int i = 0; i < arr.length; i++) {
	        	if(arr[i]==key)
	        	{
	        		System.out.println("Number fount at index : "+i);
	        		f=1;
	        		break;
	        	}
	        }
	        if(f==0)
	        	System.out.println("Number not found");
	        // Accessing elements including an out-of-bounds index
	        System.out.println("\nAccessing array elements:");
	        try {
	         for (int i = 0; i <= arr.length; i++)  // Note: <= to cause exception intentionally
	         System.out.println("Element at index " + i + ": " + arr[i]);
	            } catch (ArrayIndexOutOfBoundsException e) {
	            	System.out.println(e);
	                System.out.println(e.getMessage());
	            }
	        }
	}

	       