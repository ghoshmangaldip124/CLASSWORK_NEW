import java.util.*;
public class Bank{
		 static int blance=5000;
		 static int op=5000;
		static int add(int amount)
		{
		blance = blance+amount;
		return(blance);
		}
		
		static int withdraw(int with)
		{
			if(op<with){
				System.out.print("Insufficient Blance");
			}
			else{
				blance = blance-with;
				System.out.print("withdrawl Successfully");
			}
			return(blance);
		}
	public static void main(String[] args){
		System.out.print("Enter Your Amount :- ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int add=Bank.add(a);
		System.out.print("Deposite Successfully");
		System.out.println();
		System.out.print("Toatl Blance is :- "+blance );
	
		System.out.println();
		System.out.println("Withdrawl");
		System.out.print("Enter your amount :- ");
		int b=sc.nextInt();
		int withdraw=Bank.withdraw(b);
		System.out.println();
		System.out.print("Toatl Blance is :- "+blance );
	}
}