package myjavaproject;

public class WrapperClass {

	public static void main(String[] args) {
		int a=50;
		Integer i=Integer.valueOf(a);
		String b=String.valueOf(a);
		System.out.println(i);
		System.out.println(b);
		//AUTO BOXING, Compiler Convert Automaticlly
		Integer i1=a;
		System.out.println(i1);
		//ITEGER TO INT
		Integer x=new Integer(510);
		int x1=x.intValue();
		System.out.println(x1);
		//AUTO BOXING, Compiler Convert Automaticlly
		int x2=x;
		System.out.println(x2);
	}

}
