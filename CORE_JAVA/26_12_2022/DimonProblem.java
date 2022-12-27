package myjavaproject;


interface AA{
	public default void displayparrent()   
	{  
	System.out.println("This is parrent class");  
	}  
}
interface B extends AA{
	public default void display()   
	{  
	System.out.println("B extends to AA");  
	}  
}

interface C extends AA{
	public default void display()   
	{  
	System.out.println("C extends to AA");  
	}  
}

class D implements B, C  {  
		public void display() {  
				B.super.display();  
				C.super.display(); 
				System.out.println("D extends to B,C");
		} 
}
public class DimonProblem {

	public static void main(String[] args) {
		D ds=new D();
		ds.displayparrent();
		ds.display();
	}

}
