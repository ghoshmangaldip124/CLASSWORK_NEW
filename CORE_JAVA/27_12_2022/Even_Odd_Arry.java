//Check even odd number
//Author :- Mangaldip Ghosh
package myjavaproject;

import java.util.Scanner;

public class Even_Odd_Arry {

	public static void main(String[] args) {

		System.out.print("Enter the Array Size :- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Element :- ");
			arr[i]=sc.nextInt();
		}
		//Array element number
		System.out.println("The arry is :- ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
			
		}
		//even and odd
		System.out.println("");
		System.out.println("Even numbers :- ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println("");
		System.out.println("Odd numbers :- ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				System.out.print(" "+arr[i]);
			}
		}

	}

}
