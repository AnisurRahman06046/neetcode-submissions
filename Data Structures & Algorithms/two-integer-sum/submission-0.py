class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {}
        for k, v in enumerate(nums):
            # print(k, v)
            diff = target - nums[k]
            if diff in prevMap:
                return [prevMap[diff], k]
            prevMap[v] = k
        