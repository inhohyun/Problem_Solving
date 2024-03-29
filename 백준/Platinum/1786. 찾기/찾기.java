

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb;
	static int cnt;
	public static void main(String[] args) throws IOException {
		//몇 번 나타나는지랑 어디서부터 나타나는지 : 공백으로 구분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String parent = br.readLine();
		String pattern = br.readLine();
		
		//테이블 만들기
//		for(int i = 0; i < table.length; i++) {
//			System.out.print(table[i]+" ");
//		}
		sb = new StringBuilder();
		
		// 테이블로 문자열 패턴 찾기
		KMP(parent, pattern);
		
		System.out.println(cnt);
		System.out.println(sb);
		
	}
	
	private static int[] makeTable(String pattern) {
		int n = pattern.length();
		int[] table = new int[n];
		
		
		int idx = 0;
		for(int i = 1; i < n; i++) {
			
			while(idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx - 1];
			}
			
			if(pattern.charAt(i) == pattern.charAt(idx)) {
				idx += 1;
				table[i] = idx;
				
			}
		}
		return table;
	}
	private static void KMP(String parent, String pattern) {
		int[] table = makeTable(pattern);
		
		int n1 = parent.length();
		int n2 = pattern.length();
		
		//현재 대응되는 글자의 수
		int idx = 0;
		
		for(int i = 0; i < n1; i++) {
			
			while(idx > 0 && parent.charAt(i) != pattern.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(parent.charAt(i) == pattern.charAt(idx)) {
				if(idx == n2 - 1) {
					cnt++;
					sb.append(i-idx+1).append(" ");
					idx = table[idx];
				} else {
					idx += 1;
				}
			}
		}
	}
 

}	
