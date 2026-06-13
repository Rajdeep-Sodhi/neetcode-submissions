class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        if(len(nums) == 0):
            return False
        max_int = max(nums)
        min_int = min(nums)
        arr = [0] * (max_int - min_int + 1)
        for i in range(len(nums)):
            if(arr[nums[i] - min_int] > 0):
                return True
            else:
                arr[nums[i] - min_int] = 1
        return False