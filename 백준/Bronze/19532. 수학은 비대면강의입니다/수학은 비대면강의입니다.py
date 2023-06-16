a, b, c, d, e, f = map(int, input().split())

# # 연립방정식은 런타임 에러가 뜨네
# y = (c*d - f*a)//(b * d - a * e)
# x = (c - b*y) // a
# print(x, y)

for i in range(-999, 1000):
    for j in range(-999, 1000):
        if a *i + b*j == c and d*i + e*j == f:
            print(i, j)

