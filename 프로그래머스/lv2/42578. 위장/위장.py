def solution(clothes):
    # 1. 옷을 종류별로 구분하기
    dic = {}
    answer = 1
    for i, j in clothes:
        dic[j] = dic.get(j, 0) + 1 #key값이 이미 있으면 기존값+1, 아니면 0 + 1
        
    # 2. 입지 않는 경우를 추가하여 모든 조합을 계산한다.
    for key in dic:
        answer *= (dic[key] + 1)
    # 3. 아무 종류의 옷도 입지 않는 경우를 제외한다.

    return answer - 1