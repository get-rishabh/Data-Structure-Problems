from heapq import *
max_heap=[]
nums=[2,5,4,3,6,1]
k=2
"""
for i in range(len(nums)):
    heappush(max_heap,nums[i])
    print(max_heap)
"""
for i in range(k):
    heappush(max_heap,nums[i])
    
for i in range(k,len(nums)):
    if nums[i]>max_heap[0]:
        heappop(max_heap)
        heappush(max_heap,nums[i])
print(max_heap)

        