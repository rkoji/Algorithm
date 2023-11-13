import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        String[] arr;

        for (int i = 0; i < N; i++) {
            Stack<String> leftSt = new Stack<>();
            Stack<String> rightSt = new Stack<>();
            arr = br.readLine().split("");

            for (String s : arr) {
                switch (s) {
                    case "<":
                        if (!leftSt.isEmpty()) {
                            rightSt.push(leftSt.pop());
                        }
                        break;
                    case ">":
                        if (!rightSt.isEmpty()) {
                            leftSt.push(rightSt.pop());
                        }
                        break;
                    case "-":
                        if (!leftSt.isEmpty()) {
                            leftSt.pop();
                        }
                        break;
                    default:
                        leftSt.push(s);
                }
            }

            while (!leftSt.isEmpty()) {
                rightSt.push(leftSt.pop());
            }
            while (!rightSt.isEmpty()) {
                sb.append(rightSt.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}





