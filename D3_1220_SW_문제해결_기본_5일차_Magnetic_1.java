import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D3_1220_SW_�����ذ�_�⺻_5����_Magnetic_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T =10;
		int[][] a = new int[100][100];
		
		for(int tc=1;tc<=T;tc++) {
			int ans =0;
			sc.nextInt(); //ù ��° �ٿ� 100�� �ְɶ� �װ� �ϳ� �����(?)���ؼ��ΰ�
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					a[i][j]=sc.nextInt();  //�迭�� �־�����~
					
				}
			}
			for(int j=0;j<100;j++) {
				int p =0;  //���η� ���鼭 �� �ϴµ� ���η� �������� 0�̿��� �ϰŵ�~
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
