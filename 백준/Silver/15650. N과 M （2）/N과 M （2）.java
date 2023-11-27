import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(1, 0);
        System.out.println(sb);

    }

    public static void dfs(int y , int depth) {
        if (depth == M) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = y; i <= N; i++) {
           arr[depth] = i;
           dfs(i+1,depth+1);
        }
        return;
    }
}


