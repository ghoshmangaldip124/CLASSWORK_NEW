package myjavaproject;
import java.util.*;

class Employee{
	int id;
	String name;
	long ph;
	public  Employee(int id,String name,long ph) {
		this.id=id;
		this.name=name;
		this.ph=ph;
	}
	public void display() {
		System.out.println("Id :- "+id+"\n"+"Name :- "+name+"\n"+"Phone No :- "+ph);
	}
}

class EmpCh extends Employee{
	double salary;
	String address;
	public EmpCh(int id,String name,long ph,double salary,String address) {
		super(id,name,ph);
		this.salary=salary;
		this.address=address;
	}
	public void getData() {
		super.display();
		System.out.println("Salary :- "+salary+"\n"+"Address :- "+address);
	}
}

public class User {
	public static void main(String[] args) {
		EmpCh cd=new EmpCh(101,"mangaldip",6294769356l,15000,"kolkata");
		cd.getData();
	}
}
