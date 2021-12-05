package BOJ;

import java.util.Scanner;

public class Q20492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int priceMoney = sc.nextInt();

		System.out.println((int)(priceMoney - (priceMoney * 0.22)) + " " + (int)(priceMoney - (priceMoney * 0.2 * 0.22)));
	}
}
