def solution(nums):
    answer = 0
    set_nums = set(nums)
    if len(nums) == 0:
        return 0
    elif len(nums) / 2 > len(set_nums):
        answer = len(set_nums)
    else:
        return len(nums) / 2
    return answer