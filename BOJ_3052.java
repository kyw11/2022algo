package day1201;

import java.util.Scanner;

public class BOJ_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int cnt =0;  //서로 다른 나머지 
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for(int i=0;i<arr.length;i++) {
			int tmp = 0;  
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					tmp++;
					
				}
			}
			if(tmp==0) {
				cnt++;
			}
					
			
		}
		System.out.println(cnt);
	
		
		
	}

}
