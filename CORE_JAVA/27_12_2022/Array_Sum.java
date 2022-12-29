package myjavaproject;
import java.util.*;

public class Array_Sum {

	public static void main(String[] args) {
		int s=0;
		System.out.println("Enter the array size :- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element of"+n+":-");
			arr[i]=sc.nextInt();
			
			}
		System.out.println("Enter the element of:-");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
			s=s+arr[i];
		}
		System.out.print("The sum is :- "+s);
	}

}
