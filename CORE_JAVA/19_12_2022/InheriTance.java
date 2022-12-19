package myjavaproject;
import java.util.*;

class Parent{
	public void S_class() {
		System.out.println("Run Time Error");
	}
}
class Child extends Parent{
	public void c_class() {
		System.out.println("Compile Suceesfully");
	}
}
public class InheriTance {
	public static void main(String[] args) {
		Child ch=new Child();
		ch.S_class();
		ch.c_class();
	}
}
