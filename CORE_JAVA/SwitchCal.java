import java.util.*;
public class SwitchCal{
	public static void main(String[] args){
	do{
	System.out.println("\n");
	System.out.println("1.Addation\n2.Subtraction\n3.multiplication\n4.division\n5.exit");
	Scanner sc=new Scanner(System.in);
	System.out.print("Entert Your Choice :- ");
	int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.print("Enter First Number :- ");
			int a=sc.nextInt();
			System.out.print("Enter Second Number :- ");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Total value is :- "+c);
		break;

		case 2:
			System.out.print("Enter First Number :- ");
			a=sc.nextInt();
			System.out.print("Enter Second Number :- ");
			b=sc.nextInt();
			c=a-b;
			System.out.println("Total value is :- "+c);
		break;

		case 3:
			System.out.print("Enter First Number :- ");
			a=sc.nextInt();
			System.out.print("Enter Second Number :- ");
			b=sc.nextInt();
			c=a*b;
			System.out.println("Total value is :- "+c);
		break;

		case 4:
			System.out.print("Enter First Number :- ");
			a=sc.nextInt();
			System.out.print("Enter Second Number :- ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Total value is :- "+c);
		break;
		case 5:
			System.exit(0);
		defult:
			System.out.println("Choose Correct option");
		}
	}
	while(true);
	}
}