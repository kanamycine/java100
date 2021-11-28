import java.util.Scanner;

public class Q1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String octal = Integer.toOctalString(input);
        System.out.println(octal);
    }
}
