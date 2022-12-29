package myjavaproject;
import java.util.*;

public class Main {

	public static void taketest(Question questions[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("****Welcome to java quiz******");
		String answer;
		int score=0;
		for(int i=0;i<questions.length;i++)
		{
			System.out.println(questions[i].question);
			System.out.println("Enter ans: ");
			answer=sc.next();
			if(answer.equals(questions[i].ans))
			{
				score++;
				System.out.println("correct ans");
			}
			else
			{
				System.out.println("wrong ans");
				System.out.println(questions[i].ans);
			}
		}
		//type casting
		 System.out.println("");
		float n1=score;
		float downloaded = n1;
	    float total = 5;
	    float percent = (100 * downloaded) / total;
	    if(score==1) {
	    	System.out.print("Remarks :- Very Bad");
	    }
	    if(score==2) {
	    	System.out.print("Remarks :- Bad");
	    }
	    if(score==3) {
	    	System.out.print("Remarks :- Good");
	    }
	    if(score==4) {
	    	System.out.print("Remarks :- Very Good");
	    }
	    if(score==5) {
	    	System.out.print("Remarks :- Excellent");
	    }
	    else{
	    	System.out.print("Remarks :- Very Very Bad");
	    }
	    System.out.println("\n");
	    System.out.print(String.format("your score is :- %.0f%%",percent));
	    System.out.println("\n");
		System.out.print("Thank you");
	}
	
	public static void main(String[] args) {
		
		String s1="1. Who invented Java Programming?\r\n"
				+ "a) Guido van Rossum\r\n"
				+ "b) James Gosling\r\n"
				+ "c) Dennis Ritchie\r\n"
				+ "d) Bjarne Stroustrup";
		String s2="2. Which statement is true about Java?\r\n"
				+ "a) Java is a sequence-dependent programming language\r\n"
				+ "b) Java is a code dependent programming language\r\n"
				+ "c) Java is a platform-dependent programming language\r\n"
				+ "d) Java is a platform-independent programming language";
		String s3="3. Which component is used to compile, debug and execute the java programs?\r\n"
				+ "a) JRE\r\n"
				+ "b) JIT\r\n"
				+ "c) JDK\r\n"
				+ "d) JVM";
		String s4="4. Which one of the following is not a Java feature?\r\n"
				+ "a) Object-oriented\r\n"
				+ "b) Use of pointers\r\n"
				+ "c) Portable\r\n"
				+ "d) Dynamic and Extensible";
		String s5="5. Which of these cannot be used for a variable name in Java?\r\n"
				+ "a) identifier & keyword\r\n"
				+ "b) identifier\r\n"
				+ "c) keyword\r\n"
				+ "d) none of the mentioned";
Question []questions= {
		new Question(s1, "b"),
		new Question(s2, "d"),
		new Question(s3, "c"),
		new Question(s4, "b"),
		new Question(s5, "c")
};
Main.taketest(questions);

	}

}
