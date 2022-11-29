arr=[3,5,2,1,6,4]
arr.sort()
for i in range(1,len(arr)-1,2):
    arr[i],arr[i+1]=arr[i+1],arr[i]
print(arr)    
    
