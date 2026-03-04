class Solution:
    def findFinalValue(self, nums, original):
        while original in nums:
            original *= 2
        
        return original
