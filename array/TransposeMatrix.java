package array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] =new int[2][2];
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Array Data");
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				a[i][j]=r.nextInt();
			}
		}
		System.out.println("Matrix");
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
			System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	
	System.out.println("Transpose Matrix");
	for(int i=0;i<=1;i++) {
		for(int j=0;j<=1;j++) {
		System.out.print(a[j][i] + " ");
		}
		System.out.println("");
	}
}
}
	

