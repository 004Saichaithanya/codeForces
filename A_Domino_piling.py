M,N=list(map(int,input().split()))
vis=[[0]*N for _ in range(M)]
cnt=0

drow=[-1,0,1,0]
dcol=[0,1,0,-1]

for i in range(M):
    for j in range(N):
        if vis[i][j] != 0:
            continue
        for k in range(4):
            nrow=drow[k]+i
            ncol=dcol[k]+j
            if(nrow >=0 and ncol >= 0 and nrow < M and ncol < N and vis[nrow][ncol] == 0):
                cnt += 1
                vis[i][j]=cnt
                vis[nrow][ncol] = cnt
                break

print(cnt)




