import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		boolean[] isNotPrime = new boolean[b + 1];

		isNotPrime[0] = isNotPrime[1] = true;

		for (int i = 2; i*i <= b; i++) {
			if (isNotPrime[i]) continue;

			for (int j = i * i; j <= b; j += i) {
				isNotPrime[j] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = a; i<=b;i++){
			if (!isNotPrime[i])
				sb.append(i).append("\n");
		}

		System.out.print(sb.toString());
		sc.close();
	}
}
