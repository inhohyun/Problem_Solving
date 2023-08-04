T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    dist = [[0, 1], [1, 0], [0, -1], [-1, 0]] # 우, 하, 좌, 상
    snail = [[0] * n for _ in range(n)] # 0으로 채워진 n*n 빈달팽이 생성
    num = 1 # 달팽이를 채울 숫자
    d = 0 # 달팽이 이동방향
    x, y = 0, -1 # 시작위치
    while num <= (n*n):
        nx, ny = x + dist[d][0], y + dist[d][1]
        if 0 <= nx < n and  0<= ny < n and snail[nx][ny] == 0 :
            snail[nx][ny] = num # 숫자 넣어주기
            num += 1 # 숫자 증가
            x, y = nx, ny # 현재 위치 갱신
            
        # 달팽이 크기에서 벗어났거나, 해당 위치에 이미 숫자가 부여되어 있는 경우
        # k값 조정을 통해 방향을 바꾼다.
        else:
            d = (d+1) % 4 # 0, 1, 2, 3 으로만 움직일 수 있게 나머지를 구함
    print(f"#{test_case}")
    for row in snail:
        print(*row)
