class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(0,nums-1):
            print(i)

obj=Solution()
obj.maxSubArray([-2,1,-3,4,-1,2,1,-5,4])
