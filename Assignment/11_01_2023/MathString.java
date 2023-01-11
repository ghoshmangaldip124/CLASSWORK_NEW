//online written test have a coding question, wherein the students are 
//given a string with multiple characters that are repeated consecutively./
//You’re supposed to reduce the size of this string using mathematical 
//logic given as in the example below 

// @ Mangaldip Ghosh

package assignment.in;
import java.util.*;

public class MathString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element :- ");
		String str=sc.nextLine();
		String a=new String("");
		int count=0;
		for(int i=0;i<str.length();i++) {
				count=0;
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					
				}
			}
			if(count==1) {
				a=a+str.charAt(i);
			}
		}
		
		for(int i=0;i<a.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
				if(a.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(a.charAt(i));
			}
			else {
				System.out.print(a.charAt(i)+""+count);
			}
		}
	}

}
