arr = list(map(int,input().split()))
a,b = arr[0],arr[1]

print(f"{a//b}.",end="")

a%=b
for _ in range(20):
    a *= 10
    print(a // b, end="")
    a%=b