nums=[5,5,5,4,3,7,2,8,7]
for i in range(len(nums)-1):
    if (nums[i]<nums[i+1] and i%2==1) or (nums[i]>nums[i+1] and i%2==0):
        nums[i],nums[i+1]=nums[i+1],nums[i]
print(nums)    
    
