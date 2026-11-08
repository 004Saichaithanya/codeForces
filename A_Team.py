n=int(input())
solve=0

for _ in range(n):
    problems = list(map(int,input().strip().split()))
    cnt=0
    for x in problems:
        if x == 1:
            cnt += 1
    if cnt > 1:
        solve += 1
print(solve)


        