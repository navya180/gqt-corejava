package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
		        char ch = 'A';

		        for (int i = 1; i <= rows; i++) {
		            for (int j = i; j < rows; j++) {
		                System.out.print(" ");
		            }

		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print(ch);
		            }

		            ch++;
		            System.out.println();
		        }
		    }
		

}
