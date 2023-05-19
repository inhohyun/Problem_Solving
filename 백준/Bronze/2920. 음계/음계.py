m = input().split(" ")
if m == sorted(m):
    print("ascending")
elif m == sorted(m, reverse = True):
    print("descending")
else:
    print('mixed')
