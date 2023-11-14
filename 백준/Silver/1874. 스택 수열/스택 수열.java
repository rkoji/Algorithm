import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

       int start = 0;

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if (tmp > start) {
                for (int j = start + 1; j <= tmp; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = tmp;
            } else {
                if (stack.isEmpty() || stack.peek() != tmp) {
                    System.out.println("NO");
                    return;
                }
            }
            if (!stack.isEmpty()) {
                stack.pop();
                sb.append('-').append('\n');
            }

        }
        System.out.println(sb);
    }
}