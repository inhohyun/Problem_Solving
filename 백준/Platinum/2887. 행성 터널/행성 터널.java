
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int num, x, y, z;

		Node(int num, int x, int y, int z) {
			this.num = num;
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	static class Edge implements Comparable<Edge>{
		int start, end, weight;
		
		Edge(int start, int end, int weight){
			this.start = start;
			this.end = end;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			
			return weight - o.weight;
		}
	}
	
	static int[] parent;
	static ArrayList<Edge> edgeList;
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Node[] nodes = new Node[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			nodes[i] = new Node(i,x,y,z);
		}
		
		edgeList = new ArrayList<>();
		
		//x, y, z 각각에 대해 정렬한 뒤 각 행성의 번호와 비용을 edgeList에 추가하기
		//x처리
		Arrays.sort(nodes, new Comparator<Node>() {
		    @Override
		    public int compare(Node p1, Node p2) {
		        return p1.x - p2.x;
		    }
		});
		for(int i = 0; i < N-1; i++) {
			int weight = Math.abs(nodes[i].x - nodes[i+1].x);
			
			edgeList.add(new Edge(nodes[i].num, nodes[i+1].num, weight));
		}
		
		//y처리
		Arrays.sort(nodes, new Comparator<Node>() {
		    @Override
		    public int compare(Node p1, Node p2) {
		        return p1.y - p2.y;
		    }
		});
		for(int i = 0; i < N-1; i++) {
			int weight = Math.abs(nodes[i].y - nodes[i+1].y);
			
			edgeList.add(new Edge(nodes[i].num, nodes[i+1].num, weight));
		}
		
		//z처리
		Arrays.sort(nodes, new Comparator<Node>() {
		    @Override
		    public int compare(Node p1, Node p2) {
		        return p1.z - p2.z;
		    }
		});
		for(int i = 0; i < N-1; i++) {
			int weight = Math.abs(nodes[i].z - nodes[i+1].z);
			
			edgeList.add(new Edge(nodes[i].num, nodes[i+1].num, weight));
		}
		
		
		parent = new int[N];
		
		//make
		for(int i = 0; i < N; i++) {
			parent[i] = i;
		}
		
		Collections.sort(edgeList);
		
		int ans = 0;
		
		for(int i = 0; i < edgeList.size(); i++) {
			Edge edge = edgeList.get(i);
			
			//사이클이 발생하는 간선 제외
			if(find(edge.start) != find(edge.end)) {
				ans += edge.weight;
				union(edge.start, edge.end);
			}
		}
		
		System.out.println(ans);
	}
	
	static int find(int x) {
		if(x == parent[x]) {
			return x;
		}
		
		return parent[x] = find(parent[x]);
	}
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x != y) {
			parent[y] = x; // 루트 부모가 다르면 합치기
		}
	}
}
