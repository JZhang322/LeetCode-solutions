class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        
        nd = set(nums)
        diff = sum(nums) - sum(nd)
        return sum(nd) - diff