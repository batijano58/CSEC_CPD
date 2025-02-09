def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

y, w = map(int, input().split())
m = max(y, w)
wins = 6 - m + 1
common = gcd(wins, 6)
print(str(wins // common) + "/" + str(6 // common))
