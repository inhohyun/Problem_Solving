n = int(input())
numbers = list(map(int, input().split()))

for i in range(1, n):
    numbers[i] = max(numbers[i], numbers[i]+numbers[i-1])

print(max(numbers))