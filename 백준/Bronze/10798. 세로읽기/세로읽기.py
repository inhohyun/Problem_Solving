words = []
#문자열의 길이는 최대 15
for i in range(5):
    word = input()
    #5글자까지 공백 추가
    if len(word) < 15:
        while len(word) <15:
            word += ' '
    words.append(word)

ans = ''

for i in range(15):
    for j in range(5):
        ans += words[j][i]


print(ans.replace(' ', ''))