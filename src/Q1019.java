import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        StringTokenizer stk = new StringTokenizer(date, ".");

        int arr[] = new int[3];
        int i = 0;

        while (stk.hasMoreTokens()){
            arr[i] = Integer.parseInt(stk.nextToken());
            i++;
        }
        String year = String.format("%04d", arr[0]);
        String month = String.format("%02d", arr[1]);
        String day = String.format("%02d", arr[2]);
        System.out.println(year + "." + month + "." + day);
    }
}
