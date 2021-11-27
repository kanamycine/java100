import java.util.Scanner;

public class Q1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 5;
        System.out.println("[" + a / 10000 * 10000 + "]");
        System.out.println("[" + (a / 1000 % 10) * 1000 + "]");
        System.out.println("[" + (a / 100 % 10) * 100 + "]");
        System.out.println("[" + (a / 10 % 10) * 10 + "]");
        System.out.println("[" + (a / 1 % 10) + "]");
    }
}
