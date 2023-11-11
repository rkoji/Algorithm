import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int youngsik = 0;
        int minsik = 0;

        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            youngsik += ((k/30) + 1) * 10;
            minsik += ((k/60) + 1) * 15;
        }

        if (youngsik > minsik) {
            System.out.println("M" + " " + minsik);
        } else if (minsik > youngsik) {
            System.out.println("Y" + " " + youngsik);
        } else if (youngsik == minsik) {
            System.out.println("Y M " + minsik);
        }
    }
}