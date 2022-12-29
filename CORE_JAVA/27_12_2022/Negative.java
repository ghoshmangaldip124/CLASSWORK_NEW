//find Negative number
//Author :- Mangaldip ghosh
package myjavaproject;
import java.util.Scanner;

	public class Negative {

		public static void main(String[] args) {
			System.out.println("enter the number of elements: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int []arr=new int[10];
			int x=0;
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the elements: ");
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
			if(arr[i]<0)
			{
				System.out.println("negative number in array is:"+arr[i]);
			}
			else
			{
				System.out.println("negative number not found");
				}
			}

		}

	}