for tc in range(1,11):
    n = int(input())
    box = list(map(int, input().split()))
    for _ in range(n):
        for i in range(len(box)):
            if box[i] == max(box) and box[i] != 0:
                box[i] -= 1
                for j in range(len(box)):
                    if box[j] == min(box) and box[j] != 0:
                        box[j] += 1
                        break

                break
    print(f'#{tc}',max(box) - min(box))
