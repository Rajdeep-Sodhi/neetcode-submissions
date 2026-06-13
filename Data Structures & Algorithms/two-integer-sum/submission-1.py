class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valueToIndex = {}
        for i in range(len(nums)):
            if(nums[i] in valueToIndex):
                return [valueToIndex.get(nums[i]), i]
            else:
                valueToIndex.update({target - nums[i]: i})

        