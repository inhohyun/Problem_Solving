import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[][] board;
    static int[][] answer;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static Map<Integer, Integer> map = new HashMap<>();

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        answer = new int[n][m];

        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i][j] = Character.getNumericValue(charArray[j]);
            }
        }

        // 서로 인접해있는 빈칸들을 그룹화합니다.
        int num = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    map.put(num, bfs(i, j, num));
                    num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    answer[i][j] = 1;
                    // 4방향에 그룹이 몇개 존재 하는지 구합니다. 이 때 중복 제거를 위해 Set 사용
                    Set<Integer> set = new HashSet<>();
                    for (int d = 0; d < 4; d++) {
                        int newX = i + dx[d];
                        int newY = j + dy[d];
                        if (newX < 0 || newX >= n || newY < 0 || newY >= m || board[newX][newY] == 1) {
                            continue;
                        }

                        set.add(board[newX][newY]);
                    }
                    for (int a: set) {
                        answer[i][j] += map.get(a);
                    }
                }
            }
        }

        // 정답 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.append(Integer.toString(answer[i][j] % 10));
            }
            bw.append('\n');
        }
        bw.flush();
        bw.close();
    }

    // 인접해있는 빈칸 그룹화 메서드
    public static int bfs(int x, int y, int num) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        board[x][y] = num;
        int cnt = 1;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int d = 0; d < 4; d++) {
                int newX = point.x + dx[d];
                int newY = point.y + dy[d];

                if (newX < 0 || newX >= n || newY < 0 || newY >= m || board[newX][newY] != 0) {
                    continue;
                }

                board[newX][newY] = num;
                queue.offer(new Point(newX, newY));
                cnt++;
            }
        }

        return cnt;
    }
}