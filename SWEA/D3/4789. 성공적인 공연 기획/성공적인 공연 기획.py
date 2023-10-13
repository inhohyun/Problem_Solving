t = int(input())

for tc in range(1, t+1):
    person = input()
    chap = int(person[0]) # 현재 박수치고 있는 사람의 수
    ans = 0 # 고용할 사람의 수
    for i in range(1, len(person)):
        while True:
            if chap >= i:
                break
            if chap < i:
                ans += 1
                chap += 1
        chap += int(person[i])
    print(f'#{tc}', ans)



