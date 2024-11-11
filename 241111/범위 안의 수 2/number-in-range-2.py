sum_val = 0
average = 0
cnt = 0

for i in range(10):
    a = int(input())
    if 0 <= a <= 200 :
        sum_val += a
        cnt += 1

average = sum_val /cnt

print(f"{sum_val} {average:.1f}")