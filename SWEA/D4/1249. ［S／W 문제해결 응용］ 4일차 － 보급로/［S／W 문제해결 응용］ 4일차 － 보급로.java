
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] visited;
    static int n;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            n = scanner.nextInt();
            scanner.nextLine(); // 개행문자 제거

            arr = new int[n][n]; // 전역 변수로 선언된 arr 배열 초기화
            visited = new int[n][n];

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = line.charAt(j) - '0';
                    visited[i][j] = Integer.MAX_VALUE; // 최대값으로 초기화
                }
            }

            bfs(new int[]{0, 0});
            System.out.println("#" + tc + " " + visited[n - 1][n - 1]);
        }
    }

    static void bfs(int[] start) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(start);
        visited[start[0]][start[1]] = 0; // 시작점의 거리를 0으로 설정

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int ci = current[0];
            int cj = current[1];

            for (int d = 0; d < 4; d++) {
                int di = ci + dx[d];
                int dj = cj + dy[d];

                if (0 <= di && di < n && 0 <= dj && dj < n) {
                    if (visited[di][dj] > visited[ci][cj] + arr[di][dj]) {
                        visited[di][dj] = visited[ci][cj] + arr[di][dj];
                        q.add(new int[]{di, dj});
                    }
                }
            }
        }
    }
}
