import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] time = str.split(":");
        System.out.println(time[1]);

    }
}
