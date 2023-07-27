test = int(input())
for _ in range(test):
    days = int(input())
    ju = list(map(int, input().split()))
    # 구입한 주식 개수
    cnt = 0
    # 구입한 주식 가격
    price = 0
    #  이익
    answer = 0
    # 제일 비싼 값 저장
    max1 = max(ju)
    if ju[0] ==max1:
        print(0)
    else:
        for i in range(days):
            # 제일 비싼 값이 아닌 경우 매입
            if ju[i] != max1:
                price += ju[i]
                cnt += 1
            elif ju[i] == max1:
                # 제일 비싼 날을 만나면 가지고 있는 주식을 팔고 남은 일 중 제일 비싼 값으로 최대 값 갱신
                answer += max1 * cnt - price
                rest_ju = ju[i+1:]
                price = 0
                cnt = 0
                
                if rest_ju:
                    max1 = max(rest_ju)
           
        print(answer)
            
# 팔고 다시 추가 매입을 할 때 에러사항이 있음 -> +=로 안하고 갱신해버림 ㅋㅋ