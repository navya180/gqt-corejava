package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows: ");
 		Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
		        char startChar = 'A';

		        for (int i = 0; i < rows; i++) {
		            // Print spaces
		            for (int s = 1; s < rows - i; s++) {
		                System.out.print(" ");
		            }

		            // Print reverse characters from startChar
		            for (int j = 0; j <= i * 2; j++) {
		                System.out.print((char)(startChar - j));
		            }

		            // Go to next starting character (A, C, E, ...)
		            startChar += 2;
		            System.out.println();
		        }
		    }
		}

