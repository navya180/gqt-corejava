package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of rows:");
		
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=rows;j++) {

			System.out.print( "_");
			}
			for(int j=1;j<=rows-i;j++) {
				System.out.print( "#");

			
			
			
					
			}
			System.out.println();

	}

}
}
