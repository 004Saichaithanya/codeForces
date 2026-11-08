num = int(input())

str_num = str(num)
result = ""

for i in range(len(str_num)):
    digit = int(str_num[i])
    flipped_digit = 9 - digit
    
    # Only flip if it reduces the digit and it's not the leading digit turning to 0
    if flipped_digit < digit and not (i == 0 and flipped_digit == 0):
        result += str(flipped_digit)
    else:
        result += str(digit)

print(int(result))  # Convert to int to remove leading zeros
