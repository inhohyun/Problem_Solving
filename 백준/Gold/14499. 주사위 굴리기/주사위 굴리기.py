n, m, x, y, k = map(int, input().split())

# 지도에 쓰여있는 수 입력받기 -> 그냥 지도 입력받는 것
m_li = []
for i in range(n):
    m_li.append(list(map(int, input().split())))

order = list(map(int, input().split()))
dice = [0 for _ in range(7)]

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
# 주사위 돌리는 코드 -> 다른사람꺼 가져옴
def move(direction):
    # 1 : 오른쪽, 2 : 왼쪽, 3 : 위, 4 : 아래
    if direction == 1:
        dice[1], dice[3], dice[4], dice[6] = dice[3], dice[6], dice[1], dice[4]
    elif direction == 2:
        dice[1], dice[3], dice[4], dice[6] = dice[4], dice[1], dice[6], dice[3]
    elif direction == 3:
        dice[1], dice[2], dice[5], dice[6] = dice[2], dice[6], dice[1], dice[5]
    elif direction == 4:
        dice[1], dice[2], dice[5], dice[6] = dice[5], dice[1], dice[6], dice[2]


for i in order:
    nx = x+dx[i-1]
    ny = y+dy[i-1]
    if not 0 <= nx < n or not 0 <= ny < m:
        continue
    # 주사위 위치 이동
    x, y = nx, ny
    # 주사위 돌리기
    move(i)

    # 바닥이 0이 아니면
    if m_li [x][y]:
        dice[1] = m_li [x][y]
        m_li [x][y] = 0
    else:
        # 바닥이 0이면 주사위 아랫면을 바닥에 복사
        m_li [x][y] = dice[1]

    print(dice[6])