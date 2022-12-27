package myjavaproject;
class A1{
	public void display() {
		System.out.print("this Is Earth");
	}
}
interface male{
	public void show();
}
interface female{
	public void fshow();
}
class Child4 extends A1 implements male,female{
	public void show() {
		System.out.println("Male Person");
	}
	
	public void fshow() {
		System.out.println("Female Perosn");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		
			Child4 ch=new Child4();
			ch.display();
			ch.show();
			ch.fshow();
	}

}
