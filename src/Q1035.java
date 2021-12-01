import java.util.Scanner;

public class Q1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a, 16);
		System.out.printf("%o", b);
	}
}
