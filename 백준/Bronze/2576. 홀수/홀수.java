import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int sum = 0;
        int min = 0;

        for(int i = 0; i < 7 ; i++){
            int n = sc.nextInt();
            if(n % 2 == 1){
                if(min ==0){
                    min = n;
                }else if(min > n){
                    min = n;
                }

                sum += n;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}