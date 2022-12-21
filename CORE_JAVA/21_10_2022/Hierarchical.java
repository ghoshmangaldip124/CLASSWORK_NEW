package myjavaproject;
class Bank{
	public void bank() {
		System.out.println("\t"+"No cost EMI");
	}
}
class Sbi extends Bank{
	public void sbi() {
		System.out.print("State Bank Of India");
	}
}
class Pnb extends Bank{
	public void pnb() {
		System.out.print("Punjab National Bank");
	}
}
class Axis extends Bank{
	public void axis() {
		System.out.print("Axis bank");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Axis ax=new Axis();
		ax.axis();
		ax.bank();
		Pnb pb=new Pnb();
		pb.pnb();
		pb.bank();
		Sbi sb=new Sbi();
		sb.sbi();
		sb.bank();
	}

}
