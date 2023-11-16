import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Queue<Integer> queue = new LinkedList<>();

    static void push(int x) {
        queue.add(x);
    }

    static void pop() {
        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.poll());
        }

    }

    static void size() {
        System.out.println(queue.size());
    }

    static void empty() {
        if (queue.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    static void front() {
        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.peek());
        }
    }

    static void back(int x){
        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(x);
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
    }
}