
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] map;
	static boolean flag = true;
	static int[][] rotate;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			// map 입력 받기
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int manage = Integer.parseInt(st.nextToken());
			switch (manage) {
			case 1:
				one();
				break;
			case 2:
				two();
				break;
			case 3:
				three();
				break;
			case 4:
				four();
				break;
			case 5:
				five();
				break;
			case 6:
				six();
				break;
			}

		}
	     for(int i=0; i<n; i++){
	            for(int j=0; j<m; j++){
	                System.out.print(map[i][j]+ " " );
	            }
	            System.out.println();
	        }
	}

	// 상하 반전
    public static void one(){
        //1번 연산 : 배열 상하 반전
    	rotate = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            	rotate[n-i-1][j] = map[i][j];  //행만 서로 반대
            }
        }
        map = rotate;
    }

	// 좌우 반전
    public static void two(){
        //2번 연산 : 좌우 반전
    	rotate = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            	rotate[i][m-j-1] = map[i][j]; //열만 반대
            }
        }
        map = rotate;
    }

	// 오른쪽으로 90도 돌리기
	static void three() {

		rotate = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				rotate[j][n - 1 - i] = map[i][j];
			}

		}
		map = rotate;
		int tmp = n;
		n = m;
		m = tmp;

	}

    public static void four(){
        //4번 연산 : 왼쪽 90도 회전
    	rotate = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            	rotate[m-j-1][i] =  map[i][j];
            }
        }
        //배열 바꾸기
        int tmp = n;
        n = m;
        m= tmp;
 
        map = rotate;
 
 
    }
    public static void five(){
   
    	rotate = new int[n][m];
        for(int i=0; i<n/2; i++){
            for(int j=0; j<m/2; j++){
            	rotate[i][m/2+j] = map[i][j];
 
            }
        }
 
      
        for(int i=0; i<n/2; i++){
            for(int j=m/2; j<m; j++){
            	rotate[n/2+i][j] = map[i][j];
            }
        }
 
        for(int i=n/2; i<n; i++){
            for(int j=m/2; j<m; j++){
            	rotate[i][j-m/2] = map[i][j];
            }
        }
 
        for(int i=n/2; i<n; i++){
            for(int j=0; j<m/2; j++){
            	rotate[i-n/2][j] = map[i][j];
            }
        }
        map = rotate;
 
    }

    public static void six(){
    	rotate = new int[n][m];
    
        for(int i=0; i<n/2; i++){
            for(int j=0; j<m/2; j++){
            	rotate[n/2+i][j] = map[i][j];
 
            }
        }
        
 
   
        for(int i=n/2; i<n; i++){
            for(int j=0; j<m/2; j++){
            	rotate[i][j+m/2] = map[i][j];
            }
        }
       
        for(int i=n/2; i<n; i++){
            for(int j=m/2; j<m; j++){
            	rotate[i-n/2][j] = map[i][j];
            }
        }
       
 
      
        for(int i=0; i<n/2; i++){
            for(int j=m/2; j<m; j++){
            	rotate[i][j-m/2] = map[i][j];
            }
        }
        
        map = rotate;
 
    }



}