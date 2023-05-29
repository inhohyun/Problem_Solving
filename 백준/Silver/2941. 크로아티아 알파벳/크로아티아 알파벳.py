n = input()
word = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in word:
    if  i in n:
        n=  n.replace(i,'1')
print(len(n))
