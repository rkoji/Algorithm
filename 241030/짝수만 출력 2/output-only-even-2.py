arr = list(map(int,input().split()))
b = arr[0]
a = arr[1]

while b >= a:
    if b % 2 ==0:
        print(b ,end =" ")
    b -= 1;