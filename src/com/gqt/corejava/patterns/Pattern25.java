package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            int count = 2 * i - 1;

            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  "); 
            }

            
            for (int j = 1; j <= count; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
	}
}