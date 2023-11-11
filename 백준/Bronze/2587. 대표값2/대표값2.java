import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        int average = 0;
        int middle = 0;
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        average = sum / 5;
        
        Arrays.sort(arr);

        middle = arr[arr.length/2];

        System.out.println(average);
        System.out.println(middle);

    }
}