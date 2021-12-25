class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        alist = set(range(0,len(nums)+1))
        return (alist-set(nums)).pop()