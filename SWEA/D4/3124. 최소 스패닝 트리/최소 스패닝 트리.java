
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	static class Edge implements Comparable<Edge>{
		int to, from, weight;
		
		Edge(int to, int from, int weight){
			this.to = to;
			this.from = from;
			this.weight = weight;
					
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return Integer .compare(weight, o.weight); // 무게를 기준으로 정렬
		}
		
		
	}
	static int V, E;
	static Edge[] edgeList;
	static int[] parents;
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			
	
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			edgeList = new Edge[E]; // 간선 리스트
			for(int i = 0 ; i<E; i++) {
				st = new StringTokenizer(br.readLine());
				int to = Integer.parseInt(st.nextToken());
				int from = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				
				edgeList[i] = new Edge(to, from, weight);
			}
			
			Arrays.sort(edgeList);
			
			
			parents = new int[V+1]; // 부모 배열 만들기
			
			make();
			long weight = 0;
			int cnt = 0; // 연결한 간선의 개수
			 for(Edge edge : edgeList) { //하나씩 꺼내면서 무게 계산
				 if(!union(edge.to,edge.from)) continue; 
				 
				 weight += edge.weight;
				 
				 cnt++;
				 if(cnt == V-1) { // v-1개 만큼 연결했으면 종료
					 break;
				 }
				 
			 }
			 
			 System.out.println("#"+tc+" "+weight);
			
		}
		
		
		
		
	}
	static void make() {
		for(int i = 0; i<=V; i++) {
			parents[i] = i; // 부모를 자기 자신으로 초기화
		}
	}
	
	//a의 조상 노드 찾기
	static int find(int a) {
		if(a == parents[a]) return a;
		
		return parents[a] = find(parents[a]); // 경로 압축
	}
	
	
	
	static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		
		if(aRoot == bRoot) return false; // 조상이 같으면 같은 집합
		
		parents[aRoot] = bRoot; //조상 연결
		
		return true;
	}
	
	
	

}