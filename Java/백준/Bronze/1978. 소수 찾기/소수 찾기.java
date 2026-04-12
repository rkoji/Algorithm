import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static boolean isPrime(int n){
		if (n <= 1)return false;
		for (int i = 2; i < n; i++){
			if (n % i == 0)return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < a; i++) {
			boolean prime = isPrime(arr[i]);
			if (prime) {
				count++;
			}
		}
		System.out.println(count);

	}
}
