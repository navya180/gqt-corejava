package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows: ");
 		Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();


        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int space = 1; space < rows - i; space++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

	}

