import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
//        for (int i = 0; i < 14; i++)
//        {
//            if (i == 6)
//                continue;
//            else
//                System.out.print(num.charAt(i));
//        }

        String front = num.substring(0,6);
        String back = num.substring(7);
        System.out.println(front+back);
    }
}
