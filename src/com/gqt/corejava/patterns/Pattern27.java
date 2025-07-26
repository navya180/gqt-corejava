package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (for top half): ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
           
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


	}

}
