package myjavaproject;

import java.util.Scanner;

public class TernaryOpr {

	public static void main(String[] args) {
		int num1,num2,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1: ");
		num1=sc.nextInt();
		System.out.println("Enter the num2: ");
		num2=sc.nextInt();
		max=(num1>num2)?num1:num2;//ternary operator
		System.out.println("Greater number is: "+max);
		

	}

}
