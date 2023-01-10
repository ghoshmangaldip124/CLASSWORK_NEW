//A parking lot in a mall has RxC number of parking spaces. Each parking
//space will either be  empty(0) or full(1). The status (0/1) of a 
//parking space is represented as the element of the matrix. The task is
// to find index of the prpeinzta row(R) in the parking lot that has the
// most of the parking spaces full(1).

// @ Mangaldip Ghosh

package assignment.in;
import java.util.*;

class ParkingA{
	public void parkinga() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number Of ROW :- ");// this row
		int a=sc.nextInt();
		System.out.print("Enter the number Of COLUMN :- ");//this column
		int b=sc.nextInt();
		int arr[][]=new int[a][b];//array
		System.out.print("Enter the element :- ");
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					arr[i][j]=sc.nextInt();//array input
				}
			}
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					System.out.print(arr[i][j]+" ");//print matrix
				}
				System.out.println();
			}
			
			int count=0,sum=0,row=0;// value = 0
			for(int i=0;i<a;i++) {
				count=0; // i =0
				for(int j=0;j<b;j++) {
					if(arr[i][j]==1) {
						count++; // check the one
					}
				}
				if(count>sum) { //check the condition
					sum=count;
					row=i+1; // Row increment
				}
			}
			System.out.print(row);
	}
}
public class Parking {
	public static void main(String[] args) {
		new ParkingA().parkinga();
	}
}
