nums = [1,2,3,4,5,6,7]
k = 3
res=[0]*len(nums)
#c=0
n=len(nums)

for i in range(n):
    res[i]=nums[(i+k)%n]   
print(res)