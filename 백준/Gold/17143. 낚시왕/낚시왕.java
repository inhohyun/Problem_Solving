import java.util.*;
import java.io.*;

public class Main{

    static int X,Y,M;
    static Shark[][] req = new Shark[101][101];
    static int res = 0;

    static void moveSharks(){
        // 큐에 현재 살아있는 상어들을 모두 넣기
        Queue<Shark> sharks = new LinkedList<>();
        for(int x=1;x<=X;x++) {
            for (int y = 1; y <= Y; y++) {
                if(req[y][x] != null) sharks.add(req[y][x]);
            }
        }

        // 전체 상어 데이터 초기화
        req = new Shark[Y+1][X+1];

        // 큐가 빌 때까지 모든 상어들 움직이기
        while(!sharks.isEmpty()){
            Shark shark = sharks.poll();

            // 상하로 움직일 경우 같은 방향을 바라보며 같은 위치에 존재할 규칙성을 나눠줌
            int speed = shark.s;
            if(shark.d == 1 || shark.d == 2) speed %= (Y-1)*2;
            else speed %= (X-1)*2;

            // 속도가 0이 될때까지 1칸씩 차례대로 움직임
            while(speed-- > 0){
                // 방향에 맞게 이동값 조정
                switch (shark.d){
                    // 위
                    case 1:
                        if(shark.y==1){
                            shark.d=2;
                            shark.y++;
                        }
                        else shark.y--;
                        break;
                    // 아래
                    case 2:
                        if(shark.y==Y){
                            shark.d=1;
                            shark.y--;
                        }
                        else shark.y++;
                        break;
                    // 오른쪽
                    case 3:
                        if(shark.x==X){
                            shark.d=4;
                            shark.x--;
                        }
                        else shark.x++;
                        break;
                    // 왼쪽
                    case 4:
                        if(shark.x==1){
                            shark.d=3;
                            shark.x++;
                        }
                        else shark.x--;
                        break;
                }
            }

            // 만약 움직일 위치에 상어가 자기보다 크다면 먹힘
            // 그 외의 경우는 해당 위치로 이동

            // 움직일 위치에 상어가 존재한다면
            if(req[shark.y][shark.x] != null){
                // 움직일 위치의 상어가 더 작다면 그 위치 그대로 들어가기
                if(req[shark.y][shark.x].size < shark.size) req[shark.y][shark.x] = shark;
            }
            // 상어가 존재하지 않는다면 그 위치로 그대로 이동
            else req[shark.y][shark.x] = shark;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            req[y][x] = new Shark(x,y,s,d,z);
        }

        // 1. 오른쪽으로 한 칸 씩 이동
        for(int x=1;x<=X;x++){
            for(int y=1;y<=Y;y++){

                // 2. 땅과 가장 가까운 상어를 잡는다.
                if(req[y][x] != null){
                    res += req[y][x].size;
                    req[y][x] = null;
                    break;
                }
            }

            // 3. 상어가 이동한다.
            moveSharks();
        }

        System.out.println(res);
    }
}

class Shark{
    int x;
    int y;
    int s;
    int d;
    int size;

    public Shark(int x, int y, int s, int d, int size){
        this.x = x;
        this.y = y;
        this.s = s;
        this.d = d;
        this.size = size;
    }
}