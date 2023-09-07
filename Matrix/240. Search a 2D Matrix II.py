Link : https://leetcode.com/problems/search-a-2d-matrix-ii/
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix)
        columns = len(matrix[0])
        # print(m,n)
        i,j = 0, columns-1 
        while(j >= 0 and i < rows):
            if(matrix[i][j] == target):
                return True
            elif (matrix[i][j] < target):
                i+=1
            elif (matrix[i][j] > target):
                j-=1
        return False

        
         
        
