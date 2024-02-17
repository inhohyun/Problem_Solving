
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
	static class xy {
		int x;
		int y;

		xy(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static class XYComparator implements Comparator<xy> {
		@Override
		public int compare(xy o1, xy o2) {
			if(o1.x == o2.x) {
				return Integer.compare(o1.y, o2.y);
			}
			return Integer.compare(o1.x, o2.x);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		xy[] xyArr = new xy[n];
		for (int i = 0; i < n; i++) {
			 st = new StringTokenizer(br.readLine());
			xyArr[i] = new xy(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

		}

		Arrays.sort(xyArr, new XYComparator());

		int end = xyArr[0].y; // 각 선이 끝나는 곳
		int start = xyArr[0].x;
		int total = end - xyArr[0].x; // 전체 길이

		for (int i = 1; i < n; i++) {
//			System.out.println(end+" "+ total);

			total += xyArr[i].y - end;

			// 선이 끊긴 경우 빼주기
			if (xyArr[i].x > end) {
				total -= xyArr[i].x - end;
			}
			// 겹쳤을 때 빼주기
			if (xyArr[i].x > start && xyArr[i].y < end) {
				total -= xyArr[i].y - end;
			}

			if (end < xyArr[i].y) {
				end = xyArr[i].y; // 끝점 갱신
			}
			if (start > xyArr[i].x) {
				start = xyArr[i].x; // 시작점 갱신
			}

		}

		System.out.println(total);

	}
}
