
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

	}

	static int[] visited = new int[200001];

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
			if (current + 1 >= 0 && current + 1 <= 200000 && visited[current + 1] == 0) {
				q.add(current+1);
				visited[current + 1] = visited[current] + 1;
			}
			if (current - 1 >= 0 && current - 1 <= 200000 && visited[current - 1] == 0) {
				q.add(current-1);
				visited[current - 1] = visited[current] + 1;
			}
			if (current * 2 >= 0 && current * 2 <= 200000 && visited[current * 2] == 0) {
				q.add(current*2);
				visited[current * 2] = visited[current] + 1;
			}
		}
		return -1;
	}

}