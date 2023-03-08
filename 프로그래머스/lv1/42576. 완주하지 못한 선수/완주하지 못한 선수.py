def solution(participant, completion):
    answer = ''
    dic = {}
    temp = 0
    for i in participant:
        dic[hash(i)] = i
        temp += int(hash(i))
    for i in completion:
        temp -= int(hash(i))
    answer = dic[temp]
    return answer