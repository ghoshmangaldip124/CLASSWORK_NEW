package myjavaproject;
import java.util.*;
public class TwoDArry_Input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col,i,j;
		System.out.println("Enetr the row number :- ");
		row=sc.nextInt();
		System.out.println("Enetr the row number :- ");
		col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enetr the elements :- ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array is :- ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
