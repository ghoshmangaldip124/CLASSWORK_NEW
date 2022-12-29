//check max min
//Author :- Mangaldip ghosh
package myjavaproject;
import java.util.*;

public class Array_Max_Min {

	public static void main(String[] args) {
		 int count, max, min, i;
	        int[] arr = new int[500];
	   
	        Scanner sc = new Scanner(System.in);
	   
	        System.out.println("Enter number of elements");
	        count = sc.nextInt();
	        System.out.println("Enter " + count + " elements");
	         
	        for(i = 0; i < count; i++) {
	            arr[i] = sc.nextInt();
	        }
	   
	        max = min = arr[0];
	         
	        for(i = 1; i < count; i++) {
	            if(arr[i] > max)
	                max = arr[i];
	            else if (arr[i] < min)
	                min = arr[i];
	                
	        }
	        
	        System.out.println("Largest Number : " + max);
	        System.out.println("Smallest Number : " + min);
	       

	}

}
