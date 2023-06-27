test_case = int(input())

for i in range(test_case):
    score = list(map(int, input().split()))
    score.sort()
    score[0] = 0
    score[-1] = 0
    score_sum = sum(score) / (len(score)-2) 
    ans = round(score_sum)
    print(f'#{i+1}', ans)
