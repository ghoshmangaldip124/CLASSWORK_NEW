//Reverse array
//Author :- Mangaldip Ghosh
package myjavaproject;

import java.util.Scanner;

public class Reverse_Arry {
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
    	System.out.println("The array is reverse :- ");
    	//revrse
    	for(int i=n-1;i>=0;i--) {
    		System.out.print(" "+arr[i]);
    	}
	}
}
