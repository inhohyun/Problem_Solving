TEST = int(input())
for i in range(1, TEST+1):
    ans = input()

    ans = ans.replace('a', '')
    ans = ans.replace('e', '')
    ans = ans.replace('i', '')
    ans = ans.replace('o', '')
    ans = ans.replace('u', '')

    print(f'#{i}', ans)