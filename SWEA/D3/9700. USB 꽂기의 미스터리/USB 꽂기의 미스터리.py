t = int(input())
for tc in range(1, t+1):
    p, q = map(float, input().split())
    s = [0,0,0]
    s[0] = p
    # 처음에 뒤집어서 꽂고(1-p) 뒤집은 다음 한 번에 꽂힘(q)
    s[1] = (1-p) * q
    # 처음에 제대로 꽂았으나(p) 안꽂히고(1-q) 뒤집어서 꽂은 후(x) 다시 뒤집은 뒤 잘 꽂 힘(q)
    s[2] = p * (1-q) * q

    if s[1] < s[2]:
        print(f'#{tc}', 'YES')
    else:
        print(f'#{tc}', 'NO')