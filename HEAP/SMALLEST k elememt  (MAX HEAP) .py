from heapq import *
max_heap=[]
nums=[1,2,3,4,5,6]
for i in range(len(nums)):
    nums[i]=-1*nums[i]
#print(nums)
k=2

for i in range(k):
    heappush(max_heap,nums[i])
for i in range(k,len(nums)):
    if nums[i]>-max_heap[0]:
        heappop(max_heap)
        heappush(max_heap,nums[i])
for i in range(len(max_heap)):
    max_heap[i]=-1*max_heap[i]
print(max_heap)