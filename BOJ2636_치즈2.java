package day1005;

import java.util.LinkedList;
import java.util.Queue;
// 1. 치즈 다 녹는데 걸리는 시간
// 2. 모두 녹기 한 시간 전에 남은 치즈조가이 놓여있는 칸의 개수(남은 치즈 개수)
import java.util.Scanner;

public class BOJ2636_치즈2 {
	static int R,C, cheeseCnt;
	static int[][] map;
	static int[] dr = {1, -1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		map = new int[R][C];
		for(int i=0;i<R;i++) for(int j=0;j<=C;j++) if((map[i][j]= sc.nextInt())==1) cheeseCnt++;
		
		int time =0, last=0;
		while(cheeseCnt !=0) {
			++time;
			last = cheeseCnt;
			solve();
		}
		System.out.println(time);
		System.out.println(last);
		
	}

	private static void solve() {
		boolean[][] visited = new boolean[R][C];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0,0});
		visited[0][0] = true;
		while(!q.isEmpty()) {
			int[] data = q.poll();
			for(int d =0;d<4;d++) {
				int nr = data[0]+dr[d];
				int nc = data[1]+dc[d];
				if(nr < 0 || nc < 0 || nr >= R || nc >= C) continue;
				if(visited[nr][nc]) continue;
				
				visited[nr][nc] = true;
				
				if(map[nr][nc] == 0) {
					q.add(new int[] {nr,nc});
					continue;
				}
				map[nr][nc] = 0;
				--cheeseCnt;
			}
			
		}
		
	}

}
