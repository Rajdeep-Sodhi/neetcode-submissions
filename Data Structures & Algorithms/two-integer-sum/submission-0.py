class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valueToIndex = {}
        for i in range(len(nums)):
            if(target - nums[i] in valueToIndex):
                return [valueToIndex.get(target - nums[i]), i]
            else:
                valueToIndex.update({nums[i]: i})

        