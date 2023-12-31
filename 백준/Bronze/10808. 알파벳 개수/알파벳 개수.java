
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[(int) word.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
}