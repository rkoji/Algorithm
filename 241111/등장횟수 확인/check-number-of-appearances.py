import sys
arr = list(map(int, sys.stdin.read().splitlines()))

cnt = 0

for i in range(len(arr)):
    if arr[i] % 2 == 0:
        cnt += 1

print(cnt)