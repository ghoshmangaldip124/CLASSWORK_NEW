package myjavaproject;
import java.util.*;

public class Array_B {

	public static void main(String[] args) {
		System.out.print("Enter The Array Size :- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element :- ");
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array is :-");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
