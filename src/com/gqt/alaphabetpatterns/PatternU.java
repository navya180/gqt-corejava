/**
 * 
 */
package com.gqt.alaphabetpatterns;

import java.util.Scanner;

/**
 * 
 */
public class PatternU {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the count");
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0||i==(n-1)||j==(n-1))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}

	}


