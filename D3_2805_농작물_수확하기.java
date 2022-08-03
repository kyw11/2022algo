import java.util.Scanner;

public class D3_2805_농작물_수확하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=1;t<=T;t++) {
			
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for(int i=0;i<N;i++) {
				String s = sc.next();
				for(int j=0;j<N;j++) {
					arr[i][j] = s.charAt(j) -'0';
				}
			}
			
			
			int sum =0;
	
			int s=N/2,e=N/2;
			for(int i=0;i<N;i++) {
				
				for(int j=s;j<=e;j++) {
					sum+=arr[i][j];
				}
				if(N/2>i) {
					s--;
					e++;
				}else {
					s++;
					e--;
				}
			}

			
			System.out.println("#" + t + " " +sum);
		}

	}

}
