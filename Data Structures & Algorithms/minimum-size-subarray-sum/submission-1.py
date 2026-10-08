class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        if sum(nums) < target:
            return 0
        if target in nums:
            return 1

        n = len(nums)
        l = r = 0
        curSum = 0
        minLen = float('inf')

        while r < n:
            curSum += nums[r]
            while curSum >= target:
                minLen = min(minLen, r - l + 1)
                curSum -= nums[l]
                l += 1
            r += 1
        return minLen
