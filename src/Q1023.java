import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringTokenizer stk = new StringTokenizer(str,".");
        while(stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }

    }
}
