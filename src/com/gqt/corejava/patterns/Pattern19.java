package com.gqt.corejava.patterns;
import java.util.Scanner;


public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the count:");
		
		int n = sc.nextInt();
		int num=1;
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {

			System.out.print( num+" ");
			num++;
			
			
					
			}
			System.out.println();


	}

}
}