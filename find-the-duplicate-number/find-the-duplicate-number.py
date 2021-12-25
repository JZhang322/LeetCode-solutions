class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        hashset = set()
        for x in nums:
            if x in hashset:
                return x
            else:
                hashset.add(x)
        
        