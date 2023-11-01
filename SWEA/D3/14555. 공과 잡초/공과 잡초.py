t = int(input())
for tc in range(1, t+1):
    # 뭔소린지 모르겠는데?
    s = input()
    print(f'#{tc}', s.count('(')+s.count(')') - s.count('()'))