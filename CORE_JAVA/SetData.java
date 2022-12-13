public class SetData{
	int emp_id;
	String emp_name;
	long emp_ph;
	int salary;

public void PostData(int id,String name,long ph,int sal){
	emp_id=id;
	emp_name=name;
	emp_ph=ph;
	salary=sal;
}
public void GetData(){
	System.out.print("\n"+"Emp_id :- "+emp_id+"\n"+"Name :- "+emp_name+"\n"+"Ph Number :- "+emp_ph+"\n"+"Salary :- "+salary+"\n");
}
	public static void main(String[] args){
		SetData e1=new SetData();
		e1.PostData(101,"Arko",784512l,20533);
		e1.GetData();
	}
}