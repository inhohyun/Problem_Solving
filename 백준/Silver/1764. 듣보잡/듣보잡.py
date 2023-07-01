n , m = map(int, input().split())
# 시간초과를 해결하기 위해 dic 활용
dic = {}
ans = []
for _ in range(n):
    dic[input()] = 1
for _ in range(m):
    m_str = input()
    if m_str in dic:
        ans.append(m_str)




# 사전순 출력
ans.sort()
print(len(ans))
for i in ans:
    print(i)

    
