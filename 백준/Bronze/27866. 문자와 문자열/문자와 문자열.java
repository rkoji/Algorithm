import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int num = sc.nextInt() - 1;
        String[] arr = word.split("");
        String result = null;

        for (int i = 0; i < arr.length; i++) {
            if (i == num) {
                System.out.println(arr[i]);
            }
        }
    }
}