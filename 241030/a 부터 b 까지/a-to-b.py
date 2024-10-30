arr = list(map(int, input().split()))
a, b = arr[0], arr[1]

while a <=b:
    if a % 2 != 0:
        print(a,end =" ")
        a *= 2
    else:
        print(a,end=" ")
        a += 3