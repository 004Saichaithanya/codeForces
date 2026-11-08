#A. The New Year: Meeting Friends
frnds=list(map(int,input().split()))
x1,x2,x3=frnds

d1=abs(x1-x2)+abs(x1-x3)

d2=abs(x2-x1)+abs(x2-x3)

d3=abs(x3-x1)+abs(x3-x2)

print(min(d1,d2,d3))
