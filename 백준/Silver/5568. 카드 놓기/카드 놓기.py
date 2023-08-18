from itertools import permutations
n = int(input())
k = int(input())
numbers = []
for _ in range(n):
    numbers.append(input())


answer = set()

for i in permutations(numbers, k):
    answer.add(''.join(i))
print(len(answer))