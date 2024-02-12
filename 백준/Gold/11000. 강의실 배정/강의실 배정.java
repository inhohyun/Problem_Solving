
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] ST;
	/*
	 * 1. 늦게 끝나는 순(ST[1])으로 출력할 우선순위 큐 생성 -> ST를 전체 저장
	 * 2. 하나씩 poll하면서 시작 시간이 
	 * */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		//2차원 배열로 입력
		ST = new int[n][2];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			ST[i][0] = Integer.parseInt(st.nextToken());
			ST[i][1] = Integer.parseInt(st.nextToken());
		}
		//입력 데이터를 정렬 -> 시작 시간이 같으면, 끝나는 시간을 기준으로 정렬
		Arrays.sort(ST, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				return o1[0] - o2[0];
			}
			
		});
		//첫 번째로 끝나는 시간 저장
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(ST[0][1]);
		
		for(int i = 1; i < n; i++) {
			//시작 시간이 pq의 peek보다 작거나 같다면 pq에서 하나 뺀다.
			
			if(pq.peek() <= ST[i][0]) pq.poll();
			
			//현재 end 값을 새로 pq에 저장해간다.
			pq.add(ST[i][1]);
		}
		
		System.out.println(pq.size());
	}
}
