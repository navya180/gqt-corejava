package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows: ");
 		Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
		        for (int i = 0; i < rows; i++) {
		            for (int s = 1; s < rows - i; s++) {
		                System.out.print(" ");
		            }

		            for (char ch = (char)('A' + i); ch >= 'A'; ch--) {
		                System.out.print(ch );
		            }

		            for (char ch = 'B'; ch <= (char)('A' + i); ch++) {
		                System.out.print(ch );
		            }

		            System.out.println();
		        }
		    }
		}


	