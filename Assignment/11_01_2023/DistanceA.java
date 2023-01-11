// Write a program to calculate the fuel consumption of your truck.
//The program should ask the user to enter the quantity of diesel to fill
//up the tank and the distance covered till the tank goes dry.Calculate 
//the fuel consumption and display it in the format (liters per 100 kilometers).

// @ Mangaldip Ghosh

package assignment.in;
import java.text.DecimalFormat;
import java.util.Scanner;

class DefDis{
	public void distance() {
		//decimal formt
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of liters to fill the tank :- ");
		int a=sc.nextInt();
		//int convert to float
		double lt= (a*1.00);
		
		//vaild or nvalid Input for tank
		if(lt<1) {
			System.out.println(lt+" is an Invalid Input");
			System.exit(0);
		}
		
		//vaild or nvalid Input for distance
		System.out.print("Enter the distance covered :- ");
		int b=sc.nextInt();
		//int convert to float
		double dis= (b*1.00);
		if(dis<1) {
			System.out.println(dis+" is an Invalid Input");
		}
		
		//Then for 100 KM fuel consumption would be
		double km=(lt/dis)*100;
		
		System.out.println("Liters/100KM "+formatter.format(km)+" liters/km");
		
		//Distance is given in KM, we have to convert it to mile
		double mile=(dis*0.6214);
		System.out.println("km convert to mile "+mile);
		
		//Fuel consumption is given in liters, we have to convert it to gallons 
		double galon=(lt*0.2642);
		System.out.println("lt convert to galon "+galon);
		
		//final output Miles/gallons
		double sum=(mile/galon);
		System.out.println("Miles/gallons "+formatter.format(sum)+" miles/gallons");
	}
}
public class DistanceA {
	public static void main(String[] args) {
		new DefDis().distance();
	}

}
