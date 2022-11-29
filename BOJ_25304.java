package day_1129;

import java.util.Scanner;

public class BOJ_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();  //영수증 총금액
		int N = sc.nextInt();  //물건 종류의 수
		
		for(int i=1; i <=N; i++) {
			int x1 = sc.nextInt();
			int n1 = sc.nextInt();
			
			X = X - (x1 * n1);
			
		}
		
		if(X==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
