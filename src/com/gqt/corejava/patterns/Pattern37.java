package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows: ");
 		Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
		        int n = 5; 

		        for (int i = 1; i <= n; i++) {
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print(" ");
		            }

		            System.out.print(i);

		            if (i > 1) {
		                for (int j = 1; j <= (2 * i - 3); j++) {
		                    System.out.print(" ");
		                }
		                System.out.print(i);
		            }

		            System.out.println();
		        }

		        for (int i = n - 1; i >= 1; i--) {
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print(" ");
		            }

		            System.out.print(i);

		            if (i > 1) {
		                for (int j = 1; j <= (2 * i - 3); j++) {
		                    System.out.print(" ");
		                }		                
		                System.out.print(i);
		            }

		            System.out.println();
		        }
		    }
		}


	