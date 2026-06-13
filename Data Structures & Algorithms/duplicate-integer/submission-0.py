class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        list.sort(nums)
        for i in range(len(nums)-1):
            if(nums[i] == nums[i+1]):
                return True
        return False