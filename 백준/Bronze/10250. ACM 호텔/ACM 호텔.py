test = int(input())

for i in range(test):
    H, W, N = map(int, input().split())
    # H는 높이, W는 층 당 방 개수, N은 몇 번째 손님인지
    floor = N % H
    room_line = (N // H) + 1
    if floor == 0:
        floor = H
        room_line -= 1

    print(floor * 100 + room_line)


