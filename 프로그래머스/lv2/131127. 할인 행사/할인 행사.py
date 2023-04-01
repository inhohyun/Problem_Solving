from collections import Counter
def solution(want, number, discount):
    answer = 0
    dic1 = {}
    dic2 = {}
    #dic1 만들기
    for i in range(len(want)):
        dic1[want[i]] = number[i]
    sorted_dic1 = {k: dic1[k] for k in sorted(dic1)}

    #dic2 만들기
    for i in range(len(discount)-9):
        dis = discount[i:i+10]
        dic2 = Counter(dis)
        sorted_dic2 = {k: dic2[k] for k in sorted(dic2)}
        if sorted_dic1 == sorted_dic2:

            answer += 1
        dic2.clear()
            
    return answer