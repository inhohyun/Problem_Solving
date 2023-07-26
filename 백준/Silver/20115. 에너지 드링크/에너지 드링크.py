n = int(input())
# 소수점으로 계산
drink = list(map(int, input().split()))
drink.sort(reverse=True)
s_drink = drink[1:]
ans = drink[0] +sum(s_drink) / 2
print(ans)