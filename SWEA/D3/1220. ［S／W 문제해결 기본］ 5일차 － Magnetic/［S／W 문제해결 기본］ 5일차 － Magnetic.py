for tc in range(1, 11):
    n = int(input())
    
    arr = []
    cnt = 0
    # 100 * 100 행렬 입력받기
    for _ in range(100):
        arr.append(list(map(int, input().split())))

    # 세로(열)을 기준으로 리스트화하기
    row_arr = [[0] *100 for _ in range(100)]
    for i in range(100):
        for j in range(100):
            row_arr[i][j] = arr[j][i]
    
    # 바꾼 리스트에서 0을 모두 제거하기
    for i in range(100):
        str_row_arr = ''.join(map(str, row_arr[i]))
        str_row_arr = str_row_arr.replace('0', '')
        # 12의 개수를 세고 정답 출력하기
        cnt += str_row_arr.count('12')

    print(f'#{tc}',cnt)
    
