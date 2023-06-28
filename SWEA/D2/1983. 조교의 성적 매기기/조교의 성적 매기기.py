test = int(input())
credit = {0:'A+', 1:'A0', 2:'A-', 3:'B+', 4:'B0', 5:'B-', 6:'C+', 7:'C0', 8:'C-', 9:'D0'}
for t in range(test):
    n, k = map(int, input().split())
    
    score = []
    for i in range(1, n+1):
        first, second, assign = map(int, input().split())
        # 학생별 성적 저장    
        num = first * (35 /100) + second * (45 /100) + assign * (20 / 100)
        score.append((i, num))

    # 성적순 내림차순 정렬
    sorted_score = sorted(score, key=lambda x: x[1], reverse=True)
   
    # 성적을 나누는 기준
    standard = n // 10
    # k번째 학생 찾기
    for index, element in enumerate(sorted_score):
        if element[0] == k:
            # k 번째 학생의 순위
            number = index // standard
       
            break
    print(f'#{t+1}', credit[number])


