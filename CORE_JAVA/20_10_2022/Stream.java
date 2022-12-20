package myjavaproject;
import java.util.*;

public class Stream {
	public static void main(String[] args){
		do {
		System.out.println("Press the Menu Number");
		System.out.println("1.B.Tech"+"\n"+"2.MCA"+"\n"+"3.BMLT"+"\n"+"4.M.Tech");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the menu number :- ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("B.Tech");
		break;
		case 2:
			System.out.println("MCA");
		break;
		case 3:
			System.out.println("BMLT");
		break;
		case 4:
			System.out.println("M.Tech");
		break;
		default:
			System.out.println("Please Choose Correct Course");
		return;
		}
		System.out.println("Are You Sure 1 for Yes OR 2 for No");
		int str= sc.nextInt();  
		switch(str){
		case 1:
			System.out.println("Congratulation");
		break;
		case 2:
			System.out.println("Chooseing Stream");
		break;
		default:
			return;
			}
		}
		while(true);
	}
}
