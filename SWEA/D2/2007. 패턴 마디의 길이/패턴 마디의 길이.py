t = int(input())
for tc in range(1, t + 1):
    s = input()
    ans = 0
    target = ''
    for i in range(1, len(s)//2+1):
        # 반복되는 단어 찾기
        if s[:i] == s[i:i * 2]:
            target = s[:i]
            # 왜 target을 찾고 break를 걸면 target이 안나오는거지? -> 0일때도 성립하기 때문
            print(f'#{tc}', i)
            break





