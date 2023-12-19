import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public boolean isPrime(int res) {
        if (res == 1) {
            return false;
        }
        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int temp = arr[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : main.solution(N, arr)) {
            System.out.print(x + " ");
        }
    }
}
