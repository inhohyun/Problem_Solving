n = int(input())
count = 0

for i in range(n):
    m = str(input())
    error = 0
    for j in range(len(m) - 1):
        if m[j] != m[j+1]:
            new_word = m[j+1:]
            if new_word.count(m[j]) > 0:
                error += 1
    if error == 0:
      count += 1  

print(count)





