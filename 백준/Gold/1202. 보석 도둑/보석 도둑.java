

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static class jewel{
		int M, V; // 무게와 가치
		public jewel(int m, int v){
			this.M = m;
			this.V = v;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		jewel[] j_arr = new jewel[n];
		
		//보석 입력
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken()); //무게
			int v = Integer.parseInt(st.nextToken()); // 가치
			
			j_arr[i] = new jewel(m,v);
		}
		
		int[] b_arr = new int[k];
		//가방 입력
		for(int i = 0; i < k; i++) {
			b_arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		//정렬
		Arrays.sort(j_arr, new Comparator<jewel>() {

			@Override
			public int compare(jewel o1, jewel o2) {
				if(o1.M == o2.M) {
					return  - (o1.V -o2.V); // 무게가 같으면 가격 내림차순 
				}
				// 아니면 무게순 오름차순
				return o1.M - o2.M;
			}
			
			
		});
		//가방 오름차순 정렬
		Arrays.sort(b_arr);
		
		//가격이 내림차순이 되도록 중간 저장할 pq
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //넣을 수 있는 값들을 추가할 pq
		long max = 0;
		for(int i = 0, j =0; i < k; i++) { // j는 보석의 수 -> 입력값 3 * 10^5 -> 가방의 수만큼 1번 긁어서 만들기
			while(j < n && j_arr[j].M <=  b_arr[i]) {
				pq.offer(j_arr[j++].V);
			}
			
			//pq가 비어있지 않다면 해당 가격의 보석을 빼서 최대 값에 추가(해당 가방에 추가할 수 있는 가장 큰 값임)
			if(!pq.isEmpty()) {
				max += pq.poll();
			}
			
		}
		
		System.out.println(max);
	}
}
