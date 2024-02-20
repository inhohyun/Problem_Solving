
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m, d, board[][], answer;
	// 배치 할 궁수 3명
	static List<Archer> archers = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		init();
		combination(0);
		System.out.println(answer);
		
	}

	static void init() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		board = new int[n + 1][m]; // 맨 아래줄에 궁수들 배치할 거임

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

	}

	// 조합으로 m개의 좌표중 궁수 3명 뽑기
	static void combination(int idx) {
		// 궁수가 3명
		if (archers.size() == 3) {
			// 게임 실행 후 궁수가 맞추는 값 갱신
			answer = Math.max(playGame(board), answer);

			return;
		}

		for (int i = idx; i < m; i++) {
			archers.add(new Archer(n, i));
			combination(i + 1);
			archers.remove(archers.size() - 1); // 최근에 추가한 궁수 삭제
		}
	}

	static int playGame(int[][] map_main) {
		int[][] map = new int[n][m];
		 for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 map[i][j] = map_main[i][j];
             }
         }

		int cnt = 0; // 처리한 적의 수
		int enemy = 99;
		while (enemy > 0) {

			// 한 명씩 쏠 적들을 저장하고 한 번에 쏠거임
			for (Archer archer : archers) {
				// 궁수와 가장 가까운 적을 찾기 위해 사용할 변수
				int minDistance = Integer.MAX_VALUE;

				// 타깃 거리 -1로 초기화
				archer.targetX = -1;
				archer.targetY = -1;
				for (int j = 0; j < m; j++) {
					for (int i = n - 1; i >= 0; i--) {
						if (map[i][j] == 1) {
							int tmp = Math.abs(i - archer.x) + Math.abs(archer.y - j);

							if (tmp > d)
								break; // 거리가 넘어가면 의미 x

							if (minDistance > tmp) {
								// 가장 짧은 거리 값으로 저장 -> 계속 갱신
								minDistance = tmp;

								archer.targetX = i;
								archer.targetY = j;
							}
						}
					}
				}
			}

			// 활쏘기
			for (Archer archer : archers) {
				if (archer.targetX != -1) { // 쏠 수 있으면
					if (map[archer.targetX][archer.targetY] == 1) {
						map[archer.targetX][archer.targetY] = 0;

						cnt++;
					}

				}
			}

			enemy = 0;// 적 수 초기화
			   for (int j = 0; j < m; j++) {
                   for (int i = n - 1; i >= 0; i--) {
					if (map[i][j] == 1) {
						// 성을 만났으면 그냥 삭제
						if (i + 1 >= n) {
							map[i][j] = 0;
						} else {
							map[i + 1][j] = 1;
							map[i][j] = 0;
							enemy++; // 적이 남아있다는 거니깐 적의 수 증가
						}
					}
				}
			}
		}

		return cnt;
	}

	// 각 궁수들을 관리
	static class Archer {
		int x;
		int y;
		int targetX;
		int targetY;

		// 궁수 생성자 (초기좌표 값 필요)
		public Archer(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}