import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        float max = arr[arr.length-1];
        float min = arr[0];
        float sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = sum / max * 100 / N;
        System.out.println(average);
    }
}