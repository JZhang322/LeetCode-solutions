class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        alist = set(range(1,len(nums)+1))
        return list(alist-set(nums))