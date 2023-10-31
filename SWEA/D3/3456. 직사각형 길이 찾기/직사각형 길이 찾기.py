t = int(input())
for tc in range(1, t+1):
   a,b,c, = map(int, input().split())
   if a == b:
       print(f'#{tc}', c)
   elif b==c:
       print(f'#{tc}', a)
   elif a == c:
       print(f'#{tc}', b)