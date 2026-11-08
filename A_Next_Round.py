n,k=list(map(int,input().split()))
scores=list(map(int,input().strip().split()))
grScore=scores[k-1]
cnt=0
for score in scores:
    if score >= grScore and score > 0:
        cnt+=1
    else:
        break
print(cnt)