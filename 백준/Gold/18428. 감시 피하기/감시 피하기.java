
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static String[][] map;
	static int n;
	static String ans = "NO";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		map = new String[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = st.nextToken();
			}
		}
		makeWall(0);
		System.out.println(ans);

	}

	
	static void makeWall(int cnt) {
		if (cnt == 3) {
			// 3개가 되면 탐색 시작, 한 번이라도 yes가 나오면 됨
//			print();
			if (search().equals("YES")) {
				System.out.println("YES");
				System.exit(0);
				
			}
				
			return;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j].equals("X") ) {
					map[i][j] = "O";
					makeWall(cnt + 1);
					map[i][j] = "X";
				}
			}
		}

	}
	
	static String search() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 선생님의 감시 시작
				if (map[i][j].equals("T") ) {
					// 가로 탐색(오른쪽)
					for (int y = j; y < n; y++) {

						if (map[i][y].equals("O"))
							break;
						if (map[i][y].equals("S") )
							return "NO";
					}
					// 가로 탐색(왼쪽)
					for (int y = j; y >= 0; y--) {
						if (map[i][y].equals("O"))
							break;
						if (map[i][y].equals("S"))
							return "NO";
					}

					// 세로 탐색(아래)
					for (int x = i; x < n; x++) {
						if (map[x][j].equals("O"))
							break;
						if (map[x][j].equals("S"))
							return "NO";
					}
					// 세로 탐색(위)
					for (int x = i; x >= 0; x--) {
						if (map[x][j].equals("O"))
							break;
						if (map[x][j].equals("S"))
							return "NO";
					}
				}
			}
		}
		return "YES";
	}
	//map 찍어보기
	static void print() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}