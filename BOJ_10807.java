package day_1130;

import java.util.Scanner;

public class BOJ_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

		}
		int V = sc.nextInt();
		for (int j = 0; j <N; j++) {
			if (V == arr[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
