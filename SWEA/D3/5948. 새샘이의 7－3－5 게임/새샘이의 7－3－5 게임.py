from itertools import combinations
t = int(input())
for tc in range(1, t+1):
    numbers = list(map(int, input().split()))
    answer = []
    for value in combinations(numbers, 3):
        answer.append(sum(value))
    
    answer = list(set(answer))
    answer.sort()
    print(f'#{tc}', answer[-5])
    
   