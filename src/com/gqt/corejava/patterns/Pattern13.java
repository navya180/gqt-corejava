package com.gqt.corejava.patterns;
import java.util.Scanner;


public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the count");
		
		int n = sc.nextInt();
		int count;
		for(int i=1;i<=n;i++) {
			count=1;
			for(int j=1;j<=n;j++) {

			System.out.print(count+"");
			count=count+1;
					
			}
			System.out.println();
	}


	}

}
