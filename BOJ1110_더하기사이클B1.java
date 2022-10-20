package day_1020;

import java.util.Scanner;

public class BOJ1110_더하기사이클B1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int copy = N;
		
		while(true) {
			N = ((N %10) * 10) + (((N/10) + (N%10)) % 10);
			cnt++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
