package myjavaproject;
import java.util.*;

class Add{
	public void plus(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number :- ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number :- ");
		int b=sc.nextInt();
		int c = a+b;
		System.out.println(c);
	}
}

class Multi extends Add{
	public void multi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number :- ");
		int x=sc.nextInt();
		System.out.println("Enter the Second Number :- ");
		int y=sc.nextInt();
		int z = x+y;
		System.out.println(z);
	}
}
public class Plus {
	public static void main(String[] args) {
		Multi c1=new Multi();
		c1.plus();
		c1.multi();
	}
}
