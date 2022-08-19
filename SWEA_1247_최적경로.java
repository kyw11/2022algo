package com.ssafy.day_0819;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_1247_최적경로 {
	static int N, ans;
	static int[] order;
	static boolean[] visited;
	static int[][] map;
	static int[] home, company;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("data/SWEA_1247.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 고객 수
			ans = Integer.MAX_VALUE;
			map = new int[N][2];
			order = new int[N];
			visited = new boolean[N];
			home = new int[2];
			company = new int[2];

			company[0] = sc.nextInt();
			company[1] = sc.nextInt();
			home[0] = sc.nextInt();
			home[1] = sc.nextInt();
			for (int i = 0; i < N; i++) {
				map[i][0] = sc.nextInt();
				map[i][1] = sc.nextInt();

			}
			perm(0);
			System.out.println();
			System.out.println("#" + tc + " " +ans);
		}
		
	}

	private static void perm(int cnt) {
		if (cnt == N) {
			// System.out.println(Arrays.toString(order));
			int sum = Math.abs(company[0] - map[order[0]][0]) + Math.abs(company[1] - map[order[0]][1]);
			for (int i = 0; i < N - 1; i++)
				sum += Math.abs(map[order[i]][0] - map[order[i + 1]][0])
						+ Math.abs(map[order[i]][1] - map[order[i + 1]][1]);
			sum += Math.abs(home[0] - map[order[N - 1]][0]) + Math.abs(home[1] - map[order[N - 1]][1]);
			if (ans > sum)
				ans = sum;
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i])
				continue;
			visited[i] = true;
			order[cnt] = i;
			perm(cnt + 1);
			visited[i] = false;
		}

	}

}
