#A. Soft Drinking
mylist=list(map(int,input().split()))

n,k,l,c,d,p,nl,np=mylist

total_bottles=k*l


total_slices=c*d


bottle_toast=int(total_bottles/(n*nl))
limes_toast=int(total_slices/n)
salt_toast=int(p/(n*np))


print(min([bottle_toast,limes_toast,salt_toast]))
