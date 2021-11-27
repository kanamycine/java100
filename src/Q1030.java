import java.util.Scanner;

public class Q1030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double d2 = Math.round(d * Math.pow(10, 11)) / (double) Math.pow(10, 11);
        String str = String.format("%.11f", d2);
        System.out.println(str);
    }
}
