n = int(input())

for i in range(1, n+1):
    s = input()
    s2 = s[::-1]

    if s == s2:
        print('#'+str(i), 1)
    else:
        print('#'+str(i), 0)