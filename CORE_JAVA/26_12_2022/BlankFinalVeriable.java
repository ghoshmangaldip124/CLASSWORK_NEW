package myjavaproject;

public class BlankFinalVeriable {
	static final int data;
	static {
		data = 45;
	}
	int cube(final int n) {
		return n*n*n;
	}
	public static void main(String[] argas) {
		System.out.println(BlankFinalVeriable.data);
		new BlankFinalVeriable.cube(5);
	}

}
