import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            result.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(result.size());

    }
}