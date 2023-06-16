suger = int(input())
bag = 0

while suger >= 0:
    if suger % 5 == 0:
        bag += suger // 5
        print(bag)
        break
    suger -= 3
    bag += 1

else:
    print(-1)