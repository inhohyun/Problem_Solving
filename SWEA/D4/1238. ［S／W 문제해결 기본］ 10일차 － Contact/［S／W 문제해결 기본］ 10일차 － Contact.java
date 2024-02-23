import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int n, start;
	static List<Integer>[] g_List;
	static boolean visited[];
	static List<Integer> max_List;
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for(int t = 1; t<=10; t++) {
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			start = Integer.parseInt(st.nextToken());
			
			visited = new boolean[101];
			
			g_List = new ArrayList[101];
			
			max_List = new ArrayList<>();
			
			for(int i = 0; i<=100; i++) {
				g_List[i] = new ArrayList<>();
			}
			
			//그래프 상황 입력 받기
			st =  new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				int from = Integer.parseInt(st.nextToken());
				int to= Integer.parseInt(st.nextToken());
				g_List[from].add(to);
			}
			
			bfs(start);
//			print();
			System.out.println("#"+t+" "+max_List.get(max_List.size()-2));
			
				
			
			
		}
	}
 	static void print() {
 		for(int i = 0; i < max_List.size(); i++) {
 			System.out.print(max_List.get(i)+" ");
 		}
 	}
 	
 	static void bfs(int start) {
 		Queue<Integer> q = new ArrayDeque<>();
 		visited[start] = true;
 		q.add(start);
 		int max = start;
 		
 		
 		while(!q.isEmpty()) {
 			int qSize = q.size();
 			max = 0;
 		
 			for(int i = 1; i <=qSize; i++) {
 				int current = q.poll();
 				for (int next : g_List[current]) {
 					if(!visited[next]) {
 						visited[next] = true;
 						
 						q.add(next);
 						
 						max = Math.max(max, next);
 					}
 					
 				}	
 			}
				max_List.add(max);	
			
						
 		}
 		
 	}

}
