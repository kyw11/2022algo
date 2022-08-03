import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D3_1220_SW_문제해결_기본_5일차_Magnetic_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T =10;
		int[][] a = new int[100][100];
		
		for(int tc=1;tc<=T;tc++) {
			int ans =0;
			sc.nextInt(); //첫 번째 줄에 100이 있걸랑 그거 하나 찍어줘(?)야해서인가
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					a[i][j]=sc.nextInt();  //배열에 넣어주자~
					
				}
			}
			for(int j=0;j<100;j++) {
				int p =0;  //세로로 가면서 비교 하는데 세로로 갈때마다 0이여야 하거든~
				for(int i=0;i<100;i++) {
					if(a[i][j]==1) {
						p=1;  
					}
					else if(a[i][j]==2) {
						if(p==1) {
							ans++;
							p=2;
						}
					}
					
					
				}
			}
			System.out.println("#" + tc +" " + ans);
		}

	}

}
