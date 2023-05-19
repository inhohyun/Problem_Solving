m = input().lower()
dic = {}
#count 활용, dic 활용
for i in range(len(m)):
    #이미 나온 글자일때
    if m[i] in dic.keys():
        dic[m[i]] += 1
    #신규 글자일때
    else:
        dic[m[i]] = 1
max_value = max(dic.values())
count = sum(value == max_value for value in dic.values())
if count >1 :
    print('?')
else:
    for key, value in dic.items():
        if value == max_value:
            print(str(key).upper())


