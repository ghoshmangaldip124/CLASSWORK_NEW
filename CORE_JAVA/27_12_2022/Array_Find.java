//Find the Elements
//Author :- Mangaldip Ghosh
package myjavaproject;
import java.util.*;

public class Array_Find {

	public static void main(String[] args) {
		System.out.print("Enter the Array Size :- ");
		Scanner sc=new Scanner(System.in);
		int x,count=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element :- ");
			arr[i]=sc.nextInt();
		}
		System.out.print("The arry is :- ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.print("Enter Search Element :- ");
		x=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		if(count>0) {
			System.out.print("Item is found"+"\t" +x);
		}
		else {
			System.out.print("Item is not found");
		}
	}

}
