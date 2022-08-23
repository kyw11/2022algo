import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_7465_창용마을무리의개수 {
	static int N,M;
	static int[] p;
	private static void make() {
		p = new int[N+1];
		for(int i=1;i<=N;i++) {
			p[i] = i;
		}
	}
	private static int find(int a) {
		if(a == p[a]) return a;
		return p[a] = find(p[a]);
	}
	private static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot == bRoot) return false;
		p[bRoot] = aRoot;
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("data/7465.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			make();
			for(int i=0;i<M;i++) {
				union(sc.nextInt(),sc.nextInt());
			}
			int ans = 0;
			for(int i=1;i<=N;i++) {
				if(p[i] == i) ans ++;
			}
			
			System.out.println("#" + tc + " " + ans);
		}
		
		
		
		
	}

}


