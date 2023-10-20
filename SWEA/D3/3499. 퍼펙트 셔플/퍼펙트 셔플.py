t = int(input())
for tc in range(1, t+1):

   n = int(input())
   cards = list(input().split())
   ans = []
   # 카드의 개수가 짝수일때
   if n % 2 == 0:
       front = cards[:n//2]
       back = cards[n//2:]
       for i in range(n//2):
          ans.append(front[i])
          ans.append(back[i])
   else:
       # 앞 배열이 하나 더 가져가기
       front = cards[:n // 2+1]
       back = cards[n // 2+1:]
       for i in range(n//2):
          ans.append(front[i])
          ans.append(back[i])
       ans.append(front[-1])

   print(f'#{tc}',' '.join(map(str, ans)))


