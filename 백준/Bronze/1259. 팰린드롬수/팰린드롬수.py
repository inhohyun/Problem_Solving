while True:
    n = input()
    if n == "0":
        break
    answer = "no"

    if n == n[::-1]:
        answer = "yes"
    print(answer)