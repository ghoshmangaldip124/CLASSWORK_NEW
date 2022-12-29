package myjavaproject;
import java.util.*;

public class Negtaive_Arry {

	public static void main(String[] args) {
		System.out.print("Enter the Array Size :- ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Element :- ");
			arr[i]=sc.nextInt();
		}
		System.out.println("The arry is :- ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
			
		}
		System.out.println("");
		System.out.println("The Negative number is :- ");
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				System.out.println(arr[i]);
			}
			
		}
	}

}
