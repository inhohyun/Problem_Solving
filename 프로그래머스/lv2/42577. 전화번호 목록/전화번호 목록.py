def solution(phone_book):
    #hash를 사용하되 temp로 중간중간 저장
    answer = True
    dic = {}
    for i in phone_book:
        dic[i] = 1
    for i in range(len(phone_book)):
        temp = ""
        for j in range(len(phone_book[i])):
            temp += phone_book[i][j]
            if temp in dic and temp != phone_book[i]:
                return False
    return answer