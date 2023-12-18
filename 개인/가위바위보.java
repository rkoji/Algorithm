import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public ArrayList<String> solution(int N, int[] arrA, int[] arrB) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (arrA[i] == 1 && arrB[i] == 2) {
                answer.add("B");
            } else if (arrA[i] == 2 && arrB[i] == 1) {
                answer.add("A");
            } else if (arrA[i] == 1 && arrB[i] == 3) {
                answer.add("A");
            } else if (arrA[i] == 3 && arrB[i] == 1) {
                answer.add("B");
            } else if (arrA[i] == 2 && arrB[i] == 3) {
                answer.add("B");
            } else if (arrA[i] == 3 && arrB[i] == 2) {
                answer.add("A");
            } else if (arrA[i] == arrB[i]) {
                answer.add("D");
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrA = new int[N];
        int[] arrB = new int[N];
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(stA.nextToken());
        }
        for (int i = 0; i < N; i++) {
            arrB[i] = Integer.parseInt(stB.nextToken());
        }
        for (String str : main.solution(N, arrA, arrB)) {
            System.out.println(str);
        }

    }
}
