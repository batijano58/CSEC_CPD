s = input()
t = input()

pos = 0
for instruction in t:
    if pos < len(s) and s[pos] == instruction:
        pos += 1

print(pos + 1)
