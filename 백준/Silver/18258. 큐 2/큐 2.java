import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    static void push(int x) {
        queue.add(x);
    }

    static void pop() {
        if (queue.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue.poll()).append("\n");
        }

    }

    static void size() {
        sb.append(queue.size()).append("\n");
    }

    static void empty() {
        if (queue.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    static void front() {
        if (queue.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue.peek()).append("\n");
        }
    }

    static void back(int x){
        if (queue.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(x).append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int x = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push" :
                    x = Integer.parseInt(st.nextToken());
                    push(x);
                    break;
                case  "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    empty();
                    break;
                case "front" :
                    front();
                    break;
                case "back" :
                    back(x);
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}