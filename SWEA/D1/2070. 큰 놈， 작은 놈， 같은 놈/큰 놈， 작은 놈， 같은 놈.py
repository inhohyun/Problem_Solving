n = int(input())

for i in range(1, n+1):
    a, b = map(int, input().split())
    if a > b:
        print('#'+str(i), '>')
    elif a < b:
        print('#'+str(i), '<')
    else:
        print('#'+str(i), '=')