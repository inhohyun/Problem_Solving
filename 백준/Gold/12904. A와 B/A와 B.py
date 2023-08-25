S = input()
T = input()
word = []
word.append(S)    
while True:
    if T[-1] == 'A':
        if len(T) == len(S):
            break
        T = T[:len(T)-1]
    
    if T[-1] == 'B':
        if len(T) == len(S):
            break
        T = T[:len(T)-1]
        T = ''.join(reversed(T))
if S == T:
    print(1)
else:
    print(0)

    
