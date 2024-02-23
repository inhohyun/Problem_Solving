import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
	
	static class Edge implements Comparable<Edge>{
		int x, y;
		long cost;
		
		public Edge(int x, int y, long cost) {
			this.x = x;
			this.y =y;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			
			return Long.compare(this.cost, o.cost);
		}
	}
	
	static int n; 
	static int[] parents;
	static PriorityQueue<Edge> pq;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stX = null;
		StringTokenizer stY = null;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			n = Integer.parseInt(br.readLine());
			parents = new int[n+1];
			make();
			pq = new PriorityQueue<>();
			stX = new StringTokenizer(br.readLine());
			stY = new StringTokenizer(br.readLine());
			long[] X = new long[n];
			long[] Y = new long[n];
			
			for(int i = 0; i < n; i++) {
				X[i] = Long.parseLong(stX.nextToken());
				Y[i] = Long.parseLong(stY.nextToken());
			}
			
			Double E = Double.parseDouble(br.readLine());//세율 입력 받기
			
			for(int i = 0; i< n; i++) {
				for(int j = i+1; j < n; j++) {
					long L = (X[i] - X[j]) *(X[i] - X[j]) + (Y[i] - Y[j]) *(Y[i] - Y[j]);
					pq.add(new Edge(i,j,L));
					
				}
			}
			
			long answer = Math.round(kruskal() * E);
			
			System.out.println("#"+tc+" "+answer);		
			
		}
	}
	
	static long kruskal() {
		long cost = 0;
		int cnt = 0;
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			if(!union(e.x, e.y)) continue; //이미 mst면 continue
			
			cost += e.cost;
			
			cnt++;
			if(cnt == n-1) break;
			
		}
		
		return cost;
		
	}
	
	
	static void make() {
		for(int i = 0; i <= n; i++) {
			parents[i] = i;
	
		}	
	}
	
	static int find(int a) {
		if(parents[a] == a) return a;
		
		return parents[a] = find(parents[a]);
	}
	
	
	static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot == bRoot) return false;
		
		parents[bRoot] = aRoot;
		
		return true;
	}

}
