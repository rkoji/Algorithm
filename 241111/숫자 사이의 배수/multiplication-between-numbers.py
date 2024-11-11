arr = list(map(int, input().split()))

a = arr[0]
b = arr[1]

sum_val = 0
average = 0
cnt = 0

for i in range (a,b+1):
    if i % 5 == 0 or i % 7 ==0 :
        sum_val += i
        cnt += 1

print(sum_val, end=" ")
print(round(sum_val / cnt,1))