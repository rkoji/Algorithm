import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int x = n / k ;

        int count = 0;

        while (n != 1) {
            if (n % k != 0) {
                n = n - 1;
                count++;
            } else {
                n = n/k;
                count++;
            }
        }
        System.out.println(count);
    }
}
