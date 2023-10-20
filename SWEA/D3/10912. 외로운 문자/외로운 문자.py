t = int(input())
for tc in range(1, t+1):
    s = list(input())
    s.sort()

    result = []

    for word in s:
        if result and result[-1] == word:
            result.pop()
        else:
            result.append(word)


    if not result:
        print('#{}'.format(tc), 'Good')
    else:
        print('#{}'.format(tc), ''.join(result))


