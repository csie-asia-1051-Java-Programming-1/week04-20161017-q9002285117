package hw;

import java.util.Scanner;

public class hw03_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int n = 0;
		while (n != 999) {
			n = scn.nextInt();
			if (n > 0 && n != 999) {
				a = a + 1;
			} else {
				if (n == 0) {
					b = b + 1;
				} else {
					if (n < 0) {
						c = c + 1;
					}
				}
			}
			if (n == 999) {
				System.out.println("正數:" + a + "個" + "\n" + "0:" + b + "個" + "\n" + "負數:" + c + "個");
			}
		}

	}
}