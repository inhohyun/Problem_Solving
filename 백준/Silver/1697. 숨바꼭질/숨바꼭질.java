
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		System.out.println(bfs(n, k));
//		dfs(n,k,0);
//		System.out.println(ans);

	}
//	static int ans;
//	static void dfs(int start, int end, int tmp) {
//		//값을 찾았을 때
//		if(start == end) {
//			ans = tmp;
//			Thread.currentThread().interrupt();
//			return;
//		}
//		// 값이 조건에서 벗어나 더 연산해도 못 찾을 때
//		if(start <=0 || start > end) {
//			return;
//		}
//		//3가지 경우를 모두 탐색
//		dfs(start+1, end, tmp+1);
//		//값을 못찾아 이전 값으로 리턴했으니 연산횟수 -1 
//		tmp -= 1;
//		dfs(start-1, end, tmp+1);
//		tmp -= 1;
//		dfs(start*2, end, tmp+1);
//		return;
//	}
	
	
	
	static int[] visited = new int[100001];

	static int bfs(int start, int end) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = 1; // 1빼고 출력해도 되나 확인하기
		while (q.size() != 0) {
			int current = q.poll();
			if (current == end) {
				return visited[end] - 1;
			}
			// 3가지 조건 모두 적용해보기
			// 1간 전진한 값이 범위 안이고 아직 안 만들어본 값일 때
			if (current + 1 >= 0 && current + 1 <= 100000 && visited[current + 1] == 0) {
				q.add(current + 1);
				visited[current + 1] = visited[current] + 1;
			}
			if (current - 1 >= 0 && current - 1 <= 100000 && visited[current - 1] == 0) {
				q.add(current - 1);
				visited[current - 1] = visited[current] + 1;
			}
			if (current * 2 >= 0 && current * 2 <= 100000 && visited[current * 2] == 0) {
				q.add(current * 2);
				visited[current * 2] = visited[current] + 1;
			}
		}
		return -1;
	}

}