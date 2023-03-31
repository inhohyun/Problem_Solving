def solution(clothes):
    dic = {}
    for i, j in clothes:
        dic[j] = dic.get(j, 0) + 1 #옷 종류의 개수 넣어주기
        
    
    answer = 1
    for key in dic:
        answer *= (dic[key]+1)
        
    return answer - 1