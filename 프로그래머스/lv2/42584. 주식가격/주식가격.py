def solution(prices):
    answer = [0] * len(prices)
    stack = []
    for cur_day, cur_price in  enumerate(prices):
        while stack and stack[-1][1] > cur_price:
            pre_day, _ = stack.pop()
            answer[pre_day] = cur_day - pre_day
        
        stack.append((cur_day,cur_price))
        
    # 더 낮은 값이 없는 경우
    while stack:
        day, _ = stack.pop()
        answer[day] = len(prices) - day -1
    return answer