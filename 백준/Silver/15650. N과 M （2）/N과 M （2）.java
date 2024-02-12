import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	public static void main(String[] args) throws IOException {
		// 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N  = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		go(1);
	}
	static LinkedList<Integer> list = new LinkedList();
	static void go(int start) {
		if(list.size() == M) {
			for(int a : list) {
				System.out.print(a+" ");				
			}
			System.out.println();
			return;
		}
		
		for(int i=start; i<=N;i++) {
			list.add(i);
			go(i+1);
			list.removeLast();
		}
		
		
	}

}
