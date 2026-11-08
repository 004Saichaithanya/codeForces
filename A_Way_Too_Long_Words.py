n=int(input())

for _ in range(n):
    word=input()
    if len(word) > 10:
        first = word[0]
        second = word[-1]
        newWord = str(first + str(len(word) - 2) + second) 
        print(newWord)
    else:
        print(word)

