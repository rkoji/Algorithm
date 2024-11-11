n = int(input())

sum_val = 0

for i in range(n):
    a = int(input())
    sum_val += a

average = sum_val / n
print(f"{sum_val} {average:.1f}")