package myjavaproject;
class Company{
	int compId;
	String name;
	Address Address;
	public int getCompId() {
		return compId;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return Address;
	}
	public Company(int compId, String name, myjavaproject.Address address) {
		this.compId = compId;
		this.name = name;
		Address = address;
	}
	
	}

public class Aggretation {

	public static void main(String[] args) {
		Address ad1=new Address(713428,"Kolkata","West Bengal","India");
		Address ad2=new Address(713406,"Mumbai","MahaRastra","India");
		Company com1=new Company(102,"Airtel",ad1);
		Company com2=new Company(103,"JIO",ad1);
		System.out.println("\n Comapany Id :- "+com1.getCompId()+"\n Company Name :- "+com1.getName()+"\n Pin Code :- "+ad1.getPin()+"\n City :- "+ad1.getCity()+"\n State :- "+ad1.getState()+"\n Country :- "+ad1.getCountry());
		System.out.println("\n Comapany Id :- "+com2.getCompId()+"\n Company Name :- "+com2.getName()+"\n Pin Code :- "+ad2.getPin()+"\n City :- "+ad2.getCity()+"\n State :- "+ad2.getState()+"\n Country :- "+ad2.getCountry());
	}

}
