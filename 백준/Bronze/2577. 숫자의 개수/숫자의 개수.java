
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int multiply = A * B * C;
        String s = String.valueOf(multiply);

        for (int i = 0; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}