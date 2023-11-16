import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static Deque<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    static void push_front(int x) {
        deque.addFirst(x);
    }

    static void push_back(int x) {
        deque.addLast(x);
    }

    static void pop_front() {
        if (deque.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(deque.removeFirst()).append("\n");
        }
    }

    static void pop_back(){
        if (deque.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(deque.removeLast()).append("\n");
        }
    }

    static void size(){
        sb.append(deque.size()).append("\n");
    }

    static void empty(){
        if (deque.isEmpty()) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");        }
    }

    static void front(){
        if (deque.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(deque.peekFirst()).append("\n");
        }
    }

    static void back(){
        if (deque.isEmpty()) {
            sb.append(-1).append("\n");
        } else {
            sb.append(deque.peekLast()).append("\n");
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
                case "push_front" :
                    x = Integer.parseInt(st.nextToken());
                    push_front(x);
                    break;
                case "push_back" :
                    x = Integer.parseInt(st.nextToken());
                    push_back(x);
                    break;
                case "pop_front" :
                    pop_front();
                    break;
                case "pop_back" :
                    pop_back();
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
                    back();
                    break;
                default:
                    break;

            }

        }
        System.out.println(sb);

    }

}
