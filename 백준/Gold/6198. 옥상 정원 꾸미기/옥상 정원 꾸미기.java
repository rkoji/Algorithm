import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        long count = 0;

        for (int i = 0; i < N; i++) {
            int current = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            stack.push(current);
            count += stack.size() - 1;
        }
        System.out.println(count);
    }
}