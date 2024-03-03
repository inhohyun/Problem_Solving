

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k, tmp[], cnt, answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		tmp = new int[n]; //정렬 된 수를 저장할 배열
		int[] a = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		answer = -1; // 저장횟수가 더 적으면 -1로 초기화함
		merge_sort(a, 0, n-1);
		
		System.out.println(answer);
	}

	static void merge_sort(int[] a, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			merge_sort(a, p, q);
			merge_sort(a, q + 1, r);
			merge(a, p, q, r); // 병합
		}

	}
	
	static void merge(int[] a, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 0;
		while( i <= q && j <= r) {
			if(a[i] < a[j]) {
				tmp[t++] = a[i++]; // 더 작은 수 저장?
			}
			else {
				tmp[t++] = a[j++];
			}
		}
		
		while( i <= q) {
			tmp[t++] = a[i++];
		}
		while(j <= r) {
			tmp[t++] = a[j++];
		}
		i = p;
		t = 0;
		while(i <= r) { // 저장된 결과를 a배열에 다시 저장하기
			cnt++;
			if(cnt == k) {
				//어디 인덱스에 있는걸 저장해야되지
				answer = tmp[t];
				break;
			}
			a[i++] = tmp[t++];
		}
	}
}
