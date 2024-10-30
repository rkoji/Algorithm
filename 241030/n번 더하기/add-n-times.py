arr = list(map(int,input().split()))

a,n = arr[0],arr[1]

for _ in range(n):
    a += n
    print(a)