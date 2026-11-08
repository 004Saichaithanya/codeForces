matrix=[[],[],[],[],[]]

for i in range(5):
    row=list(map(int,input().strip('').split()))
    matrix[i]=row

ans_location=[]
mid_x=2
mid_y=2

for i in range(5):
    for j in range(5):
        if matrix[i][j] == 1:
            ans=abs(i-mid_x)+abs(j-mid_y)
            print(ans)
            exit()