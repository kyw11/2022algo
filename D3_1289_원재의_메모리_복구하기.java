import java.util.Scanner;

public class D3_1289_원재의_메모리_복구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int result =0;  //횟수를 저장하는 변수
			char[] num = sc.next().toCharArray(); // 메모리의 원래 값
			char temp ='0';  //초기화 0
			
			for(char c : num) {
				if(temp == c) continue;
				temp =c;
				result++;
				
			}
			System.out.println(result);
		}
	}

}
