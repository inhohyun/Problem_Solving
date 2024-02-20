

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int n, result;
	static List<meeting> list = new ArrayList<>();
	static List<Integer> now = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		init();
		solution();
	}

	static void init() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			list.add(new meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		Collections.sort(list);

	}

	// 회의실 개수 구하기
	static void solution() {
		now.add(list.get(0).end);
		result++;
		for (int i = 1; i < n; i++) {
			int flag = 0;
			int start = list.get(i).start;
			int end = list.get(i).end;

			for (int j = 0; j < now.size(); j++) {
				if (now.get(j) > start) { // 회의실 하나로 안됨
					continue;
				} else { // 회의실 하나로 가능
					now.remove(j);
					now.add(end);
					flag = 1;
					break;

				}

			}
			// 앞서 회의실을 추가로 사용했는지 판별
			if (flag == 0) {
				result++;
				now.add(end);
			}
		}

		System.out.println(result);
	}

	static class meeting implements Comparable<meeting> {
		int start, end;

		meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(meeting o) {

			if (start == o.start)
				return this.end - o.end;

			else
				return this.start - o.start;
		}
	}
}
