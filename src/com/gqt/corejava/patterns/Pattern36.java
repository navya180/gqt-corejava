package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows: ");
 		Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
int max=5;



        for (int i = max; i >= 1; i--) {
            for (int s = 0; s < max - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        for (int i = 2; i < max; i++) {
            for (int s = 0; s < max - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("5");
        }
        System.out.println();
    }
}

       