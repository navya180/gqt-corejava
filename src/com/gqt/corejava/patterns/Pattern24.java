package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  "); 
            }

           
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
	}
}

