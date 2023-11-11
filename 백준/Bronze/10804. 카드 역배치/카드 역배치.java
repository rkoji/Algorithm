import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[21];
        for (int i = 1; i < 21; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int mid = (y - x) / 2;

            for (int j = 0; j <= mid; j++) {
                int tmp = arr[x + j];
                arr[x + j] = arr[y - j];
                arr[y - j] = tmp;
            }
        }
        for (int i = 1; i < 21; i++) {
            System.out.print(arr[i]+ " ");
        }


    }
}