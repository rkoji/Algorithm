import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) {
                stack.push(n);
            } else {
                stack.pop();
            }
        }

        int sum = 0;

        if (!stack.isEmpty()) {
            for (Integer i : stack) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}





