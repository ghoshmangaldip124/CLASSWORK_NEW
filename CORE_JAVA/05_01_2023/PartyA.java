// A party has been organised on cruise. 
//The party is organised for a limited time(T). 
//The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as
//elements of the array. The task is to find the maximum number of guests 
//present on the cruise at any given instance within T hours.

//@ Mangaldip Ghosh 

package myjavaproject;
import java.util.*;
class PartyMatrix{
	public void partymatrix() {
		Scanner sc=new Scanner(System.in); 		//Scanner class
		
		int len;
		System.out.println("Enter the time :- "); //enter the time
		len=sc.nextInt();
		
		int []e=new int[len];	// entering array
		int []l=new int[len];	// leaving array
		
		for(int i=0;i<len;i++) {
			System.out.println("Enter the number :- ");
			e[i]=sc.nextInt(); // entering input array
		}
		
		System.out.println("==============================");
		
		for(int i=0;i<len;i++) {
			System.out.println("Enter the time :- ");
			l[i]=sc.nextInt();	//leaving input array
		}
		
		int max=0,sum=0; //result & compear
		for(int i=0;i<len;i++) {
			sum +=e[i]-l[i]; 	// substraction two array entering array - leaving array
			max=Math.max(sum, max); // compaer matrix java math function
		}
		System.out.println(max);
	}
}

public class PartyA {

	public static void main(String[] args) {
		new PartyMatrix().partymatrix(); 	// anamos object
	}

}
