import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node{
    int x, y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}

public class Main {

    static int n;
    static int m;
    static int[] dx;
    static int[] dy;
    static int[][] map;
    static boolean[][] visited;
    static Queue<Node> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];
        q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;

        dx = new int[]{1,0,-1,0};
        dy = new int[]{0,1,0,-1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                count++;
                q.offer(new Node(i, j));
                visited[i][j] = true;
                area = 0;
                while (!q.isEmpty()) {
                    Node node = q.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int nx = node.getX() + dx[k];
                        int ny = node.getY() + dy[k];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                            continue;
                        }
                        if (map[nx][ny] == 1 && !visited[nx][ny]) {
                            q.offer(new Node(nx, ny));
                            visited[nx][ny] = true;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

}
