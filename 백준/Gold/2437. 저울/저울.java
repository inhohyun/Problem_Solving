
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, chu[];
	public static void main(String[] args) throws IOException {
		init();
		int answer = solution();
		
		System.out.println(answer);
	}
	
	static void init() throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		chu = new int[n];
		for(int i = 0; i < n; i++) {
			chu[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(chu); 
		
	}
	
	static int solution() {
		int sum = 0; // 앞에서 부터 1개씩 츄를 가지고 만들 수 있는 최대 수
		for(int i = 0; i < n; i++) {
			//1부터 1개씩 써서 만들 수 있는 수의 최댓 값 -> 보다 큰 수를 만들려면 그 다음수를 이용해야 함 -> 근데 그 다음 수가 만들려는 수보다 더 크다면? 못 만듦
			//무슨 아이큐 테스트 하는거 같다.
			if(sum + 1 < chu[i]) break; // 흠...
			
			
			sum += chu[i]; // 현재 추들의 누적합
			
		}
		
		return sum + 1; //외않됨?
		
	}
	
	//에반데? -> 뭔가 아이디어 필요
//	static void combi(int depth,int[] tmp,int ans) {
//		
//		//선택 
//		tmp = 
//		combi(int depth+1,)
//	}
//	
}
