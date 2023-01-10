//Jack is always excited about sunday. It is favourite day, 
//when he gets to play all day. And goes to cycling with his friends. 
//So every time when the months starts he counts the number of sundays 
//he will get to enjoy. Considering the month can start with any day, 
//be it Sunday, Monday…. Or so on.

// @ Mangaldip Ghosh

package assignment.in;
import java.util.*;

public class WeekDay {
	public static int Day(String day) {
		if("mon".equals(day))
			return 6;
		else if("tue".equals(day))
			return 5;
		else if("wed".equals(day))
			return 4;
		else if("thu".equals(day))
			return 3;
		else if("fri".equals(day))
			return 2;
		else if("sat".equals(day))
			return 2;
		else if("sun".equals(day))
			return 1;
		return 0;
	}
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day // Ex :- mon,tue,wed :- ");
		String day=sc.nextLine(); // String Input
		System.out.print("Enter the days :- ");
		int a=sc.nextInt();//int input
		int res=0,sum=0; //local var
		res=a-Day(day);//int - day
		if(a>=0) {
			sum=res/7+1;//day cal
			System.out.print(sum+" number of days within "+a+" days");
		}
		else {
			System.out.print("Please correct value");
		}
			
		}
}
