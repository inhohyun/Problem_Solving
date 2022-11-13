

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int [][] graph;
	static boolean[] visited  = new boolean[1001]; //입력 케이스 +1
	static int node, line;
	static Queue<Integer> q = new LinkedList<>();
	//인접 행렬로 그래프 구현
	//1로 표시된 부분은 연결되었다는 뜻
	public static void putEdge(int[][] graph, int x, int y) {
		graph[x][y] = 1;
		graph[y][x] = 1;
	}

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	 node = sc.nextInt();
	 line = sc.nextInt();
	int start = sc.nextInt();
	
     graph = new int[node+1][node+1];
	
	for(int i=0;i<line;i++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		putEdge(graph, x, y);
	}
	//dfs
	dfs(start);
	System.out.println();
	Arrays.fill(visited, false); // 방문 배열 초기화
    //bfs
	bfs(start);
		
	}
	//재귀함수로 구현
	static void dfs(int start) {
		visited[start] = true;
		System.out.print(start+" ");
		
		//반복 재귀
		for(int i=1;i<=node;i++) {
			
			if(graph[start][i]==1 && !visited[i]) {
			dfs(i);	
			}
		}
	}
	
	//큐로 구현
	static void bfs(int start) {
		q.add(start);
		visited[start] = true;
		
		while(!q.isEmpty()) {
			start = q.poll();
			System.out.print(start+" ");
			
			for(int i=1;i<=node;i++) {
				if(graph[start][i] ==1 &&!visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
}
