import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] arr = word.split("");
        System.out.println(arr.length);
    }
}