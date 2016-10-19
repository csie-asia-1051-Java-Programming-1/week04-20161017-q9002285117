package hw;

import java.util.Scanner;

public class hw02_105021038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int o = n - m;
		int sum1 = 1;
		int sum2 = 1;
		int sum3 = 1;
		for (int i = n; i >= 1; i--) {
			sum1 = sum1 * i;
		}
		for (int j = m; j >= 1; j--) {
			sum2 = sum2 * j;
		}
		for (int k = o; k >= 1; k--) {
			sum3 = sum3 * k;
		}
		System.out.println(sum1 / (sum2 * sum3));
	}

}
