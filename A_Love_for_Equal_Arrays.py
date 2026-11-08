from math import gcd

t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    ans = 0

    for i in range(n):
        g = gcd(a[i], b[i])
        lcm = (a[i] // g) * b[i]

        if a[i] != lcm:
            ans += 1
        if b[i] != lcm:
            ans += 1

    print(ans)
