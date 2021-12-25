class Solution(object):
    def containsDuplicate(self, nums):
        
        hashset = set(nums)
        
        if len(hashset) == len(nums):
            return False
        
        return True
        
        """
        :type nums: List[int]
        :rtype: bool
        """
        