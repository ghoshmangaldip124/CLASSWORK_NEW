//find the Duplicate element
//Author :- Mangaldip Ghosh
package myjavaproject;

import java.util.Scanner;

public class Duplicate_Array {

	public static void main(String[] args) {
			System.out.println("Enter elements in array size :- ");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    	for(int i=0;i<n;i++) {
		    		System.out.println("Enter the element :- ");
		    		arr[i]=sc.nextInt();
		    	}
		    	
		    	System.out.println("The array is :- ");
		    	for(int i=0;i<n;i++) {
		    		System.out.print(" "+arr[i]);
		    		}
		    	
		    	System.out.println("");
		    	System.out.println("Duplicate value is :- ");
		    	for(int i=0;i<n;i++) {
		    		for(int j=i+1;j<n;j++) {
		    			if(arr[i]==arr[j]) {
		    				System.out.print(" "+arr[j]);
		    			}
		    		}
		    	}

	}

}
