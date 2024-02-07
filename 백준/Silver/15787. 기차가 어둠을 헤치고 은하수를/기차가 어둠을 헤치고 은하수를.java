import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] trains = new int[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int manage = Integer.parseInt(st.nextToken());
			int trainNumber = Integer.parseInt(st.nextToken());
			int manNumber = 0;

			switch (manage) {
			case 1:
				manNumber = Integer.parseInt(st.nextToken());
				trains[trainNumber] |= (1 << manNumber);
				break;
			case 2:
				manNumber = Integer.parseInt(st.nextToken());
				trains[trainNumber] &= ~(1 << manNumber);
				break;
			case 3:
				trains[trainNumber] <<= 1;

				// 맨 왼쪽(21번째) 비트를 지워줘야 하니까
				// 맨 왼쪽은 0, 20번째~1번째는 모두 1로 두고 &연산
				trains[trainNumber] &= ((1 << 21) - 1);
				break;
			case 4:
				trains[trainNumber] >>= 1;
				trains[trainNumber] &= ~1;
			}
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= N; i++) {
			set.add(trains[i]);
		}
		System.out.println(set.size());
	}

}