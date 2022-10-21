package day_1021;
/*
 * 1.x의 십의 자리를 q,일의 자리를 r이라고 했을 때 q + r을 한 sum을 구한다
 * 2.x=r*10+sum%10으로 초기화 해준다
 * 3.x와N이 다시 같아지는 순간 까지 1 2를 반복한다 
 * 문제에서 일의 자리가 0일경우에 대한 처리를 하지 않아도 된다 
 * 
 * 
 */

import java.util.Scanner;

public class BOJ1110_복습2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int copy = N;  // 넣어주고 시작
		int cnt = 0;  //반복횟수 
		
		while(true) {  //while문을 선택한 이유는 반복문을 언제 까지 돌아야하는지 명확히 알수 없기 때문에
			//1.x쪼개기
			int x = copy / 10;  //십의자리
			int y = copy %10 ; //일의 자리
			
			int sum = x + y;
			
			//2.x 초기화 하기
			copy = y *10 + sum %10;  //초기화 되면서 x의 일의자리가 십의 자리가 되고 sum의 일의자리가 일의자리로 옴
			cnt++;  //횟수 늘려주고
			
			//3. 반복문 나올수 있는 조건문 만들기
			if(copy == N) break;
			
		}
		System.out.println(cnt);

	}

}
