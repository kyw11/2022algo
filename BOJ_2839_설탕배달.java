import java.util.Scanner;

public class BOJ_2839_설탕배달 {
	//3kg,5kg
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //설탕
		int bag =0;
		
		while(true) {
			if(N%5==0) {
				bag+=N/5;
				System.out.println(bag);
				break;
			}
			else {
				N-=3;
				bag++;
			}
			if(N<0) {
				System.out.println("-1");
				break;
			}
		}
		
		
	}
		
}

