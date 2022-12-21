package myjavaproject;
class Animel{
	public void animel() {
		System.out.println("Dog");
	}
}
class Dog extends Animel{
	public void dog() {
		System.out.println("Dog is a Animel");
	}
}
class Puppy extends Dog{
	public void puppy() {
		System.out.println("A cute Puppy");
	}
}
public class MultiLevel {
	public static void main(String[] args) {
		Puppy ph=new Puppy();
		ph.animel();
		ph.dog();
		ph.puppy();
	}

}
