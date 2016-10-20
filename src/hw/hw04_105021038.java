package hw;

import java.util.Scanner;

public class hw04_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("請輸入選項1,2,3,4:");
			int option = scn.nextInt();
			if (option == 1) {
				System.out.println("請輸入n(奇數)");
				int n = scn.nextInt();
				int m = n + 2;
				for (int i = 1; i <= (m / 2) - 1; i++) {
					for (int j = i; j <= (m / 2); j++) {
						System.out.print("@");
					}
					System.out.println();
				}
				for (int i = 1; i <= (m / 2); i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("@");
					}
					System.out.println();
				}

			}
			if (option == 2) {
				System.out.println("請輸入n(奇數)");
				int n = scn.nextInt();
				for (int i = 1; i <= (n / 2) + 1; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("%");
					}
					System.out.println();
				}
				for (int i = 1; i <= (n / 2); i++) {
					for (int j = i; j <= (n / 2); j++) {
						System.out.print("%");
					}
					System.out.println();
				}
			}
			if (option == 3) {
				System.out.println("請輸入n(奇數)");
				int n = scn.nextInt();
				for (int i = 1; i <= (n / 2); i++) {
					for (int j = n - 1; j > i; j--) {
						System.out.println();
					}
					for (int k = 1; k < i * 2; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i = (n / 2) + 1; i > 0; i--) {
					for (int j = n - 1; j > i; j--) {
						System.out.println();
					}
					for (int k = 1; k < i * 2; k++) {
						System.out.print("*");
					}
					System.out.println();
				}
				

				}if (option == 4) {
					System.out.println("結束程式");
					break;
			}
		}
	}
}