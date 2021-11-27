import java.util.Scanner;

public class Q1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        for(int i = 0; i < a.length(); i++){
            System.out.println("'" + a.charAt(i) + "'");
        }
    }
}
