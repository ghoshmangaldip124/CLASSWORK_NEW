package myjavaproject;

public class TwoDArray {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,8,9},{8,2,30}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
