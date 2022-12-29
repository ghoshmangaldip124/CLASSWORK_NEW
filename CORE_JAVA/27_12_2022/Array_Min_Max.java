package myjavaproject;
import java.util.*;

public class Array_Min_Max {

	public static void main(String[] args) {
		System.out.println("Enter elements in array");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
	       int arr[]=new int[n];
	       int min=0;
	       int max=0;
	       for(int i=0;i<n;i++)
	       {
	    	   System.out.println("Enter elements in array :- ");
	         arr[i]=sc.nextInt();
	         if(arr[i]<min)
	           {
	           min=arr[i];
	           System.out.println(min);
	           }
	       }
	       
//	       for(int i=0;i<=n;i++) {
//	    	   if(arr[i]>max)
//	         {
//	           max=arr[i];
//	         }
//	       }
//	       System.out.println("Maximum element is "+max);
//	       System.out.println("Minimum element is "+min);
	       
	       

	}

}
