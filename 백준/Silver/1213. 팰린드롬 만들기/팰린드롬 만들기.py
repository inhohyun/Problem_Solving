import sys
from collections import Counter

word = list(map(str, sys.stdin.readline().strip()))
word.sort() # 사전순으로 정렬하기 위해 오름차순 정렬
check = Counter(word) # 홀수의 개수를 확인하기 위해 Counter 함수 사용

cnt = 0 # 홀수의 개수
center = "" # 홀수의 문자
for i in check:
    if check[i] % 2 != 0:
        cnt += 1
        center = i
        # 홀수인 수를 문자열에서 제거
        word.remove(i)

# 홀수의 개수가 2개 이상일 경우 못만듦
if cnt > 1:
    print("I'm Sorry Hansoo")
else:
    # 어떻게 출력할 것인지?
    res = ''
    for i in range(0, len(word), 2):

        # 하나씩만 문자열에 저장
        res += word[i]

    print(res + center + res[::-1])

    
