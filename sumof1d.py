class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum=0
        new=[]
        for i in range(len(nums)):
            sum+=nums[i]
            new.append(sum)
        return new