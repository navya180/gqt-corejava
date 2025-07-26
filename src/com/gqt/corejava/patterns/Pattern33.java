package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows: ");
 		Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int s = 1; s < rows - i; s++) {
                System.out.print(" ");
            }

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
