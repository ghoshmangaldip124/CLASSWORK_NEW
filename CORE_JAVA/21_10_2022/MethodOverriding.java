package myjavaproject;

class ParaentBank{
	public void loanintreast() {
		System.out.println("10% loan Interast");
	}
}
class SbiBank extends ParaentBank{
	public void loanintreast() {
		System.out.println("9% loan Interast");
	}
}
class PnbBank extends ParaentBank{
	public void loanintreast() {
		System.out.println("8% loan Interast");
	}
}
class AxisBank extends ParaentBank{
	public void loanintreast() {
		System.out.println("6.5% loan Interast");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
//		AxisBank ab=new AxisBank();
//		ab.loanintreast();
//		PnbBank pb=new PnbBank();
//		pb.loanintreast();
//		SbiBank sb=new SbiBank();
//		sb.loanintreast();
//		ParaentBank ps=new ParaentBank();
//		ps.loanintreast();
		
		ParaentBank pb; //this is called typcasting
		pb=new ParaentBank();
		pb.loanintreast();
		pb=new AxisBank();
		pb.loanintreast();
		pb=new PnbBank();
		pb.loanintreast();
		pb=new SbiBank();
		pb.loanintreast();
		
	}

}
