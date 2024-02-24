
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static class Node{
		int num;
		double x;
		double y;
		
		Node(int num, double x, double y){
			this.num = num;
			this.x = x;
			this.y =y;
		}
	}
	
	static class Edge implements Comparable<Edge>{
		int from, to;
		double weight;
		
		Edge(int from, int to, double weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
		@Override
		public int compareTo(Edge o) {
			
			
			return Double.compare(weight, o.weight);
		}
		
		
	}
	
	static int n, parents[];
	static Node[] nodes;
	static List<Edge> edgeList;
	
	public static void main(String[] args) throws IOException {
		init();
		
		double answer = kruskal();
		
		System.out.printf("%.2f", answer);
	}
	
	
	static void init() throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		nodes = new Node[n];
		edgeList = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			
			nodes[i] = new Node(i, x, y); // 노드 저장	
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j < n; j++) {
				double weight = distance(nodes[i], nodes[j]);
				
				edgeList.add(new Edge(nodes[i].num, nodes[j].num, weight));
				
			}
		}
		Collections.sort(edgeList);
		
		parents = new int[n];
		for(int i = 0; i < n; i++) {
			parents[i] = i; // 부모를 자신으로 초기화ㅣ
		}
		
		
	}
	
	static double kruskal() { //찾았다!

		double weight = 0; // 찾았당
		for(int i = 0; i < edgeList.size(); i++) {
			Edge edge = edgeList.get(i);
			
			if(union(edge.from, edge.to)) {
				weight += edge.weight;
			}
		
		}
		return weight;
		
	}
	
	
	static int  find(int a) {
		if(parents[a] == a) return parents[a];
		
		return parents[a] = find(parents[a]);
		
	}
	
	static boolean union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
	
		if(aRoot == bRoot) return false;
		
		parents[aRoot] = bRoot;
		
		return true;
	}
	static double distance(Node n1, Node n2) {
		double dis = Math.sqrt(Math.pow(Math.abs(n1.x - n2.x), 2)  + Math.pow(Math.abs(n1.y - n2.y), 2)  );
		
		
		
		return dis;
	}

}
