//You have write a function that accepts, a string which length is 
//“len”, the string has some “#”, in it you have to move all the hashes
//to the front of the string and return the whole string back and print it.

//@Mangaldip Ghosh

package assignment.in;
import java.util.*;

class MoveHash{
	public void movehash(String str,int n) { //method pass parametter string and length
		String strA=new String(""); //number a string
		String strB=new String(""); //number b string
		String result;  //result string
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='#') { //check #
				strA+=str.charAt(i); //convert string
//				System.out.println(strA);
			}
			else {
				strB+=str.charAt(i); //string
//				System.out.println(strB);
			}
		}
		result=strA.concat(strB); //two result concat
		System.out.print(result);//print result
	}
}
public class Hash {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your case :- ");
		String a=sc.nextLine();  //input
		int n=a.length(); //input length
		new MoveHash().movehash(a, n); //method calling
	}

}
