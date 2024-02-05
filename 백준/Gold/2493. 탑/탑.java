import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static class top_info{
		int num;
		int height;
		top_info(){
			
		}
		top_info(int num, int height){
			this.num = num;
			this.height = height;
		}
		int getNum() {
			return num;
		}
		
		int getHeight() {
			return height;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		Stack<top_info> stack = new Stack();
		
		
		StringBuilder answer = new StringBuilder();
		
		for(int i = 1; i<=n; i++) {
			int height = Integer.parseInt(st.nextToken());
			if(stack.isEmpty()) {
				//스택이 비었을 경우 정답에 0을 넣고 stack에 top의 번호와 높이를 저장
				answer.append(0+" ");
			
				stack.push(new top_info(i, height));
			}
			//스택이 비지 않았을 경우
			else {
				while(true) {
					if(stack.isEmpty()) {
						//스택이 비었을 경우 정답에 0을 넣고 stack에 top의 번호와 높이를 저장
						answer.append(0+" ");
					
						stack.push(new top_info(i, height));
						break;
					}
					
					if(stack.peek().getHeight() >= height) {
						answer.append(stack.peek().getNum()+" ");
						stack.push(new top_info(i, height));
						break;
					}
					// 신호를 못 받아주면 계속 빼면서 받아줄 탑 찾기
					else {
						stack.pop();
					}
				}
				
			}

		}
		System.out.print(answer);
		
	}

}