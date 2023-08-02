N = int(input())
K = int(input())
sensor = list(map(int, input().split()))

sensor.sort()
array = []
for i in range(N-1):
    # 거리차이 저장
    array.append(sensor[i+1] - sensor[i])

array.sort()
print(sum(array[:N-K]))
# for i in range(K-1):
#     array.pop()
# print(sum(array))

