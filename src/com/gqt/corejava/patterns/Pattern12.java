package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the count");
		
		int n = sc.nextInt();
		int x=n*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {

			System.out.print(x+"");
			x--;
			}
			System.out.println();
	}

	}

}
