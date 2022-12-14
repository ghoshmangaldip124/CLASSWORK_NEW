class Student{
	int s_roll;
	String s_name;
	long s_ph;
	String s_address;

	Student(int id,String name){
		s_roll=id;
		s_name=name;		
		}

	Student(int id,String name,long ph,String add){
		s_ph=ph;
		s_address=add;		
		}

	void display(){
		System.out.print("Student Roll :-"+s_roll+"\n"+"Student Name :- "+s_name+"\n"+"Student Contact :- "+s_ph+"\n"+"Student Address :- "+s_address+"\n");
		}
}
public class Home{
	public static void main(String[] args){
		Student sd=new Student(101,"Mangaldip",253);
		sd.display();
	}
}