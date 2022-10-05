package day1005;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1260_DFS와BFS {
	static int N; //정점
	static int M; //간선
	static int V;  //시작 정점
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		N = sc.nextInt();
		map = new int[1001][1001];
		M = sc.nextInt();
		visited = new boolean[10001];
		V = sc.nextInt();
		
		int a,b;
		
		for(int i=1;i<=M;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			map[a][b] = map[b][a] = 1;
		}
		dfs(V);
		for(int j=1;j<=N;j++) {
			visited[j]=false;
		}
		System.out.println();
		
		bfs(V);
	}
	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i+ " ");
		int temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			for(int j=0;j<N+1;j++) {
				if(map[temp][j] == 1 && visited[j] == false) {
					q.offer(j);
					visited[j]= true;
					System.out.print(j+" ");
				}
			}
		}
		
	}
	private static void dfs(int i) {
		visited[i] = true;
		System.out.print(i+" ");
		
		for(int j=1;j<=N;j++) {
			if(map[i][j]==1 && visited[j]==false) {
				dfs(j);
			}
		}
		
	}
	

}
